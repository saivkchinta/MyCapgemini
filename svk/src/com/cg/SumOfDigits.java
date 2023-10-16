package com.cg;

public class SumOfDigits {
	
		public static void main(String[] args) {

			String str="1234";

			char[] charArray = str.toCharArray();

	        int sum = 0;

	        for (char a : charArray) {

	            if (Character.isDigit(a)) {
	
	               int digit = Character.getNumericValue(a);

	                sum += digit;

	            }
	        }

	        System.out.println("Sum of digits in the string: " + sum);

	        }
}
