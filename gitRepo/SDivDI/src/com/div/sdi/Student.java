package com.div.sdi;

public class Student {
	
	private int id;
	private String studentName;
	
	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	 public Student(int id) {
		 this.id = id;
	 }

	//used for setter injection
	/*
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */
	public void displayInfo() {
		System.out.println("Student  Name : "+studentName+", id: "+id);
		
	}	
}
