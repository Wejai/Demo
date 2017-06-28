package com.cbs.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.MimeMappings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.annotation.Resource;

import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.Database;
import java.util.List;
import java.net.URL;

@SpringBootApplication
public class OpenBankingCbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenBankingCbsApplication.class, args);
	}
	
    @Resource
	  private CloudantConfig dbconfig;

    @Bean
    public Database cloudantclient () {

      Database db = null;
      try {

        CloudantClient client = ClientBuilder.url(new URL(dbconfig.getHost()))
                    .username(dbconfig.getUsername())
                    .password(dbconfig.getPassword())
                    .build();

          //Get socialReview db
          // Get a Database instance to interact with, but don't create it if it doesn't already exist
          db = client.database("techfun", true);
          System.out.println(db.info().toString());

      }catch (Exception e)
      {
        e.printStackTrace();
      }

    return db;
}
}
