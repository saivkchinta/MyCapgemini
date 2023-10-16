package com.cg;

public class Array {
	public static void main(String[] args) {
		
	}

	String [][]data= {


			   {"Strno","Stname","Marks"},

			   {"1","Rahul","90"},

			   {"2","Prajwal","80"},

			   {"3","Bharat","70"},

			   {"4","Moin","75"},

			   {"5","chandu","85"}



	   };
	public static void main(String[] args) {


			System.out.println("Enter the Student Rollno");

			int rno=sc.nextInt();


			// Write your code





			for(int i=0;i<data.length;i++) {

				for(int j=0;j<data[i].length;j++) {

					System.out.print("  "+data[i][j]);

				}

				System.out.println();

			}

	}
}
