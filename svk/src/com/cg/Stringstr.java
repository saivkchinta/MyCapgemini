package com.cg;

public class Stringstr {
	public static void main(String[]args) {

		String str="20,30,40,50";
		String[]numbers = str.split(",");
		int sum =0;
				
				for (String numStr:numbers) {
					int num = Integer.parseInt(numStr);
					sum+=num;
					
				}
		System.out.println("sum of num: "+sum);
	}

}
