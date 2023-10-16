package com.cg;

import java.util.Scanner;

public class Main {


	public static void main(String args[]) {


		Scanner S=new Scanner(System.in);


		System.out.println("If you are permanent employee enter 1");

		System.out.println("If you are Temporary employee enter 2");


		System.out.println("Enter Employee Type: ");

		int i=S.nextInt();


			if (i==1) {


				System.out.println("Enter Employee Id:");

				int empid=S.nextInt();


				System.out.println("Enter Employee Name:");

				String empName=S.next();


				System.out.println("Enter Basic Salary: ");

				double baseSalary=S.nextDouble();


				System.out.println("Enter hike percentage: ");

				int hikePercent=S.nextInt();


				PermanentEmployee1 P= new PermanentEmployee1(empid,empName,baseSalary,"Analyst",hikePercent);


				P.calculateSalaryHike();


			}

			else if (i==2){


				System.out.println("Enter Employee Id:");

				int empid=S.nextInt();


				System.out.println("Enter Employee Name:");

				String empName=S.next();


				System.out.println("Enter Basic Salary: ");

				double baseSalary=S.nextDouble();


				System.out.println("Enter the Service Period in months: ");

				float sp=S.nextFloat();
				
				TemporaryEmployee T= new TemporaryEmployee(empid,empName,baseSalary,sp);





				T.calculateSalaryHike();

			}



	}

 

}
