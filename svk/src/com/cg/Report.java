package com.cg;

public class Report {
	public static void main(String[]args) {
		Student std1 = new Student();
		std1.setStudentrollnumber(473);
		std1.setStudentname("saisvk");
		std1.setMaths(75);
		std1.setChemistry(58);
		std1.setPhysics(60);
		
		int rollnumber = std1.getStudentrollnumber();
		String nameofthestudent = std1.getStudentname();
		int mathsmarks = std1.getMaths();
		int chemistrymarks = std1.getChemistry();
		int physicsmarks = std1.getPhysics();
		
		System.out.println("Studentno:- "+rollnumber);	
		System.out.println("Name:- "+nameofthestudent);
		System.out.println("maths:- "+mathsmarks);
		System.out.println("chemistry:- "+chemistrymarks);
		System.out.println("physics:- "+physicsmarks);
		
	}
}
