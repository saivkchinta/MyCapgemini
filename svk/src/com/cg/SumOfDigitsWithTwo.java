package com.cg;

public class SumOfDigitsWithTwo {

	public static void main(String[] args) {
		String str ="30,32,50,26,70";
		String[] numbers = str.split(",");
		int sum =0;
		for(String s:numbers) {
			if(s.contains("2")) {
			int n = Integer.parseInt(s);
			sum = sum + n;
		}
		}
		System.out.println("The sum of digits that contains 2 is: "+sum);
	}

}