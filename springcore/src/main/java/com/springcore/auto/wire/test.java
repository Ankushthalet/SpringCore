package com.springcore.auto.wire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
	       
	       Emp temp=(Emp)context.getBean("emp");
	       System.out.println(temp.getAddress());
	       
	       System.out.println(temp);
	       
	
	
	}

}
