package com.cg;

public class Testt {

	public static void main(String[] args) {

		  Pizza p1 = new Pizza("Medium",20,3);

		    Pizza p2 = new Pizza("Medium",20,3);

		    // guys iam overiding equals method

		    // checking object data

		    if(p1.equals(p2))

		    	System.out.println("Yes Identical");

		    else

		    	System.out.println("Not identical");
	}

}
