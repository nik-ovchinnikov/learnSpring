package com.luv2code.springdemo.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student") 
public class StudentController {
	
	@RequestMapping("/studentForm")
	public String studentForm (Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}

	@RequestMapping("/studentInfo")
	public String studentInfo (@ModelAttribute("student") Student theStudent) {
		return "student-info";
	}
}
