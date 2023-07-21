package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
	       
	      Person temp=(Person)context.getBean("person1");
	       
	       System.out.println(temp);
	       System.out.println(temp.getFeestructure().getClass().getName());

	}
	

}
