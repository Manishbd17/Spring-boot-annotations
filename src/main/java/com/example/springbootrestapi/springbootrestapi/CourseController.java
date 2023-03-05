package com.example.springbootrestapi.springbootrestapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllData() {
		return Arrays.asList(
				new Course(1,"Spring","freeCodeCamp"),
				new Course(2,"React","freeCodeCamp"),
				new Course(3,"Java","freeCodeCamp")
				);
	
	}
}
