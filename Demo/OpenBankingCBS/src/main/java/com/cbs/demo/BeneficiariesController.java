package com.cbs.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.IndexField;
import com.cloudant.client.api.model.IndexField.SortOrder;
import com.cloudant.client.api.model.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/beneficiaries")
public class BeneficiariesController {
	@Autowired
	private Database db;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Beneficiaries> getAll(@RequestParam(required = false) String bid) {

		List<Beneficiaries> allDocs = null;
		try {
			if (bid == null) {
				
				allDocs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse()
						.getDocsAs(Beneficiaries.class);
			} else {

				// create Index
				// Here is create a design doc named designdoc
				// A view named querybybidView
				// and an index named bid
				db.createIndex("querybybidView", "designdoc", "json",
						new IndexField[] { new IndexField("bid", SortOrder.asc) });
				System.out.println("Successfully created index");
				// allDocs = db.findByIndex("{\"bid\" :\"" + bid + "\"}",
				// Review.class);
				allDocs = db.findByIndex("{\"bid\" : " + bid + "}", Beneficiaries.class);
			}

		} catch (Exception e) {
			System.out.println("Exception thrown : " + e.getMessage());
		}

		return allDocs;
	}
}
