package com.fossbytes.coursera.model;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Generated("org.jsonschema2pojo")
@ToString
public class Instructor {

	@Expose
	@Getter @Setter private String id;
	
	@Expose
	@Getter @Setter private String fullName;
}
