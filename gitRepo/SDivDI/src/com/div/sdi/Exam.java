package com.div.sdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		//general way of creating object and accessing data from dfrnt class
		/*
		 * Student stu = new Student(); stu.setStudentName("Divya"); stu.displayInfo();
		 */
		
		//Spring way for creating objects using ApplicationContext Container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Creating obj using bean id in the xml 
		Student st = context.getBean("student", Student.class);
		// calling methods from obj 
		st.displayInfo();
		
		/* Extra obj creation
		 * Student st2 = context.getBean("student2", Student.class); st2.displayInfo();
		 */
		
		Student st3 = context.getBean("student3", Student.class);
		// calling methods from obj 
		st3.displayInfo();	}

}
