package com.cg;
import java.util.Scanner;

public class GenerateSalary {
	public static void main(String[]args) {
		Employee ep=new Employee(4633,"sai",12000,2000,1200,4000,6000,200,1200);
		ep.getEmpdetails();
		ep.generateSalary();
	}

}
