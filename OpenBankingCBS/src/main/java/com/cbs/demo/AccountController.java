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
@RequestMapping("/balances")
public class AccountController {

	@Autowired
	private Database db;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Accounts> getAll(@RequestParam(required = false) String aid) {

		List<Accounts> allDocs = null;
		try {
			if (aid == null) {
				
				allDocs = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse()
						.getDocsAs(Accounts.class);
			} else {

				// create Index
				// Here is create a design doc named designdoc
				// A view named querybyaidView
				// and an index named aid
				db.createIndex("querybyaidView", "designdoc", "json",
						new IndexField[] { new IndexField("aid", SortOrder.asc) });
				System.out.println("Successfully created index");
				// allDocs = db.findByIndex("{\"aid\" :\"" + aid + "\"}",
				// Review.class);
				allDocs = db.findByIndex("{\"aid\" : " + aid + "}", Accounts.class);
			}

		} catch (Exception e) {
			System.out.println("Exception thrown : " + e.getMessage());
		}

		return allDocs;
	}
}
