package com.luv2code.springdemo.mvc;


import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	
	
	private String firstName;
	private String lastName;
	private String countryName;
	private String favLang;
	private ArrayList<String>  opSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> langs;
	private ArrayList<String> opSystemsChoose;

	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("Italy", "IT");
		countryOptions.put("Russia", "RU");
		countryOptions.put("France", "FR");
		countryOptions.put("Belgium", "BG");
		
		langs = new LinkedHashMap<>();
		
		langs.put("Java", "Java");
		langs.put("PHP", "PHP");
		langs.put("Ruby", "Ruby");
		langs.put("C#", "C#");
		
		opSystemsChoose =  new ArrayList<>();
		opSystemsChoose.add("MS Windows");
		opSystemsChoose.add("Linux");
		opSystemsChoose.add("Mac OS");
		
		
	}
	
	

	public ArrayList<String> getOpSystems() {
		return opSystems;
	}

	public void setOpSystems(ArrayList<String> opSystems) {
		this.opSystems = opSystems;
	}

	public ArrayList<String> getOpSystemsChoose() {
		return opSystemsChoose;
	}

	public LinkedHashMap<String, String> getLangs() {
		return langs;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
