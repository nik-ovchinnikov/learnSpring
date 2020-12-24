package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataChanging {
	
	@RequestMapping("/dataChangeForm")
	public String formToChange() {
		return "data-change-form";
	}
	
	@RequestMapping("/changedDataPage")
	public String processDataChange(HttpServletRequest request, 
			Model model,
			@RequestParam("studentName") String name
		) {

		
		//получить имя из формы
		//String name = request.getParameter("studentName");
		//преобразовать имя
		
		name = name.toUpperCase();
		String result = "Yo!!! " + name;
		
		//записать изменённые данные в модель
		model.addAttribute("messageResult", result);
		
		return "changed-data";
	}
	
}
