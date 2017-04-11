package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan ("com.niit");
		
		context.refresh();
		
		context.getBean("user");
		
		System.out.println("The instance is created sucessfully");
	}

}
