package com.fossbytes.coursera;

import java.util.List;

import com.fossbytes.coursera.model.Course;

public class TestCourse {

	public static void main (String args[])
	{
		CourseraFactory coursera = CourseraFactory.getInstance();
				
		List<Course> courses = coursera.getAllCourses(null);
		
		for (Course c : courses)
		{
			System.out.println(c);
		}
	}
}
