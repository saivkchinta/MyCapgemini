package com.cg;

public class Mobilescomperision {
	public static void main(String[] args) {
		int samsungA2 = 17000;
		int vivoY62 = 17000;
		String sammobile = "samsungA2";
		String vivomobile = "vivoY62";
		int difference1 = Math.subtractExact(samsungA2,vivoY62);
		int difference2 = Math.subtractExact(vivoY62,samsungA2);
		
		
		System.out.println("cost of "+sammobile +" and " +vivomobile +" is: "+Math.addExact(samsungA2, vivoY62));
		//System.out.println("Difference between "+sammobile +" and " +vivomobile+ " is: "+Math.subtractExact(vivoY62,samsungA2));
		System.out.println("cost of 3 "+sammobile+" mobiles are: "+samsungA2*3);
		
		if(samsungA2 > vivoY62) {
			System.out.println(sammobile +" is higher cost then "+vivomobile);
			
			System.out.println("Difference between "+sammobile +" and " +vivomobile+ " is: "+difference1);
			System.out.println("Samsung is "+difference1+" more costly than vivo");

		}
		else if(samsungA2 == vivoY62) {
			System.out.println("Both mobiles are same cost");

		}
		else {
			System.out.println(vivomobile+ " is higher cost then "+sammobile);
			System.out.println("Difference between "+sammobile +" and " +vivomobile+ " is: "+difference2);
			System.out.println("Vivo is "+difference2+" more costly than Samsung");


		}
	}

}
