package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customer")
@Controller
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/form")
	public String showForm(Model theModel) {
		System.out.println("enter");
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer/form";
	}
	
	@RequestMapping("/confirmation")
	public String confirmForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {

		System.out.println("confirm");
		
		System.out.println("Binding result: " + theBindingResult);
		
		if (theBindingResult.hasErrors()) {
			return "customer/form";
		} else {
			return "./customer/confirmation";
		}
	}
}
