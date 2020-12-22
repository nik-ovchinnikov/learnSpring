package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPropFile {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach2", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.toString());
		
		// close the context
		context.close();
		
		//������� ��� ����������
		
		// ������� ������ �� ��� ��� ����� �����
		
		//������� ��������� �����
		
			
		//�� �������� ����� ������� �� ������� �����
	}

}







