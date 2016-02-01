package com.fossbytes.coursera;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fossbytes.coursera.model.Course;
import com.fossbytes.coursera.model.Instructor;
import com.fossbytes.coursera.model.Partner;
import com.fossbytes.coursera.utils.Operations;
import com.fossbytes.coursera.utils.RestUtility;
import com.google.gson.Gson;

public class CourseraFactory {

	private static CourseraFactory singleton = new CourseraFactory();

	public static CourseraFactory getInstance() {

		return singleton;
	}

	public Course getCourseById(String id, Map<String, String> args) {
		CourseraRequest request = new CourseraRequest();
		request.setOperation(Operations.COURSES_INFO + "?ids=" + id);
		addCourseArgs(args, request);
		String output = RestUtility.sendRequest(request);

		JSONArray courseResponse = (JSONArray) new JSONObject(output).get("elements");
		Gson mapper = new Gson();
		return mapper.fromJson(courseResponse.get(0).toString(), Course.class);
	}

	public List<Course> getAllCourses(Map<String, String> args) {
		CourseraRequest request = new CourseraRequest();
		request.setOperation(Operations.COURSES_INFO);
		addCourseArgs(args, request);
		String output = RestUtility.sendRequest(request);

		JSONArray courseResponse = (JSONArray) new JSONObject(output).get("elements");
		Gson mapper = new Gson();

		List<Course> list = new ArrayList<Course>();

		for (int i = 0; i < courseResponse.length(); i++) {
			JSONObject course = (JSONObject) courseResponse.get(i);
			Course newCourse = mapper.fromJson(course.toString(), Course.class);
			list.add(newCourse);
		}
		return list;
	}

	public Instructor getInstructorById(String Id) {
		return null;
	}

	public List<Instructor> getAllInstructor() {
		return null;
	}

	public Partner getPartnerById(String Id) {
		return null;
	}

	public List<Course> getAllPartner() {
		return null;
	}

	private void addCourseArgs(Map<String, String> args, CourseraRequest request) {
		if (null != args && !args.isEmpty()) {
			for (Map.Entry<String, String> entry : args.entrySet()) {
				request.addArgument(entry.getKey(), entry.getValue());
			}
		}
	}
}
