package com.cg;

public class Switchcase {

	public static void main(String[] args) {
		String option = "Sunday";
		//System.out.println("Choose one from list 1.Sunday\n 2.Mon \n 3.Tue");
		switch(option){
		case "Sunday":
			System.out.println("Sunday");
			break;
		case "Mon":
			System.out.println("Mon");
			break;
		case "Tue":
			System.out.println("Tue");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
