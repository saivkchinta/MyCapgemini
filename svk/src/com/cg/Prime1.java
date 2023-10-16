package com.cg;

public class Prime{
	public static void main(String[] args) {
		
	
	int a = 5;
	int count = 0;
	
	if(a>1){
		for(int i=1;i<=a;i++){
			if (a%i==0) {
				count++;
				break;
			}
			if(count==2){
			System.out.println("is a prime number");
			}
			else{
			System.out.println("is not a prime number");
			}
	}
  }
}}

