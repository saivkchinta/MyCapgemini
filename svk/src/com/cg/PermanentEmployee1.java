package com.cg;

 

public class PermanentEmployee1 extends Employee1 {


	private String designation;

	private int hikePercent;


	public PermanentEmployee1(int empid, String empName, double baseSalary, String designation, int hikePercent) {

		super(empid, empName, baseSalary);

		this.designation = designation;

		this.hikePercent = hikePercent;



	}

	public String getDesignation() {

		return designation;

	}

	public void setDesignation(String designation) {

		this.designation = designation;

	}

	public int getHikePercent() {

		return hikePercent;

	}

	public void setHikePercent(int hikePercent) {

		this.hikePercent = hikePercent;

	}


	public void calculateSalaryHike() {


		System.out.println("Employee Name: "+getEmpName());

		System.out.println("Base Salary: "+getBaseSalary());

		System.out.println("Designation: "+getDesignation());

		System.out.println("hike Percentage: "+getHikePercent());



		double hike = getBaseSalary()*(1+(hikePercent/100));

		double salary=getBaseSalary()+hike;

		System.out.println("Salary after hike: "+salary);




	}




 

}

