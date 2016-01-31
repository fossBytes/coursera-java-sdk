package com.fossbytes.coursera.utils;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestUtility {

	private RestUtility() {
    }

	 public static String sendRequest(String url) {
	        WebResource webResource = new Client().resource(url);

	        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

	        if (response.getStatus() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + response.getStatus());
	        }

	        return response.getEntity(String.class);
	    }
	 
	 
}
