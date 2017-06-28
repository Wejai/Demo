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
@RequestMapping("/transactions")
public class TransactionsController {

	@Autowired
	private Database db;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Transactions> getAll(@RequestParam(required = false) String tid) {

		List<Transactions> allDocs = null;
		try {
			if (tid == null) {
				
				allDocs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse()
						.getDocsAs(Transactions.class);
			} else {

				// create Index
				// Here is create a design doc named designdoc
				// A view named querybytidView
				// and an index named tid
				db.createIndex("querybytidView", "designdoc", "json",
						new IndexField[] { new IndexField("tid", SortOrder.asc) });
				System.out.println("Successfully created index");
				// allDocs = db.findByIndex("{\"tid\" :\"" + tid + "\"}",
				// Review.class);
				allDocs = db.findByIndex("{\"tid\" : " + tid + "}", Transactions.class);
			}

		} catch (Exception e) {
			System.out.println("Exception thrown : " + e.getMessage());
		}

		return allDocs;
	}
}
