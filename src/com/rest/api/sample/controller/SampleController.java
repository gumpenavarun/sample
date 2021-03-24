package com.rest.api.sample.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.sample.pojo.Student;

@RestController
public class SampleController {
	@GetMapping("/")
	protected List<Student> getListOfStudents() {
		
		List<Student> al = new ArrayList<Student>();
		Student st = new Student();
		st.setId("dfd34");
		st.setName("varun Chakravarthy");
		st.lastname="dfdf";
		al.add(st);
		st = new Student();
		st.setId("dkfndkf");
		st.setName("Chakravarthy");
		st.lastname="second lastname";
		al.add(st);
		return al;
	}
	
	@PostMapping("/")
	public List<Student> name(@RequestBody List<Student> student) {
		//List<Student> getNames = new ArrayList<Student>();
		//getNames.addAll(student);
		List<Student> students = getListOfStudents();
		for (Student student2 : students) {
			System.out.println(student2.getName());
			System.out.println(student2.getLastname());
			
		}
		return students;
	}

}
