package com.fossbytes.coursera.model;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Generated("org.jsonschema2pojo")
@ToString
public class Course {
	@Expose
	@Getter @Setter private String id;

	@Expose
	@Getter @Setter private String slug;

	@Expose
	@Getter @Setter private String courseType;

	@Expose
	@Getter @Setter private String name;

	@Expose
	@Getter @Setter private String [] primaryLanguages;
	
	@Expose
	@Getter @Setter private String [] subtitleLanguages;
	
	@Expose
	@Getter @Setter private String [] instructorIds;
	
	@Expose
	@Getter @Setter private String [] partnerIds;
	
	
	@Expose
	@Getter @Setter private String partnerLogo;
	
	@Expose
	@Getter @Setter private String photoUrl;
	
	@Expose
	@Getter @Setter private String description;
	
	@Expose
	@Getter @Setter private String startDate;
	
	@Expose
	@Getter @Setter private String workload;
	
	@Expose
	@Getter @Setter private String previewLink;
	
	@Expose
	@Getter @Setter private String [] specializations;

	@Expose
	@Getter @Setter private String [] categories;
}
