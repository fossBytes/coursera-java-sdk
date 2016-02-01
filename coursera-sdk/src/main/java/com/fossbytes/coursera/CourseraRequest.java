package com.fossbytes.coursera;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class CourseraRequest {
	private String operation;
	private Map<String, String> arguments;

	public CourseraRequest() {
		arguments = new HashMap<String, String>();
	}

	public String getOperation() {
		return operation;
	}

	public CourseraRequest setOperation(String operation) {
		this.operation = operation;
		return this;
	}

	public CourseraRequest addArgument(String argName, String argValue) {
		if (argValue == null) {
			return this;
		}
		try {
			arguments.put(argName, URLEncoder.encode(argValue, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return this;
	}

	public String createUrl() {
		String url = "https://api.coursera.org/api/" + operation + "?";
		for (Map.Entry<String, String> entry : arguments.entrySet()) {
			url = url.concat(entry.getKey() + "=" + entry.getValue() + "&");
		}
		return url;
	}
}
