package com.cg;

public class Mainn {


	public static void main(String args[]) {


		ICICIBank IB=new ICICIBank();

		KotakMahBank KMB=new KotakMahBank();


		System.out.println("ICICI Bank returns "+IB.getSavingInterestRate()+" % interest rate on Savings Account");

		System.out.println("Kotak Bank returns "+KMB.getSavingInterestRate()+" % interest rate on Savings Account");

		System.out.println();


		System.out.println("ICICI Bank returns "+IB.getFixedInterestRate()+" % interest rate on Fixed Deposit");

		System.out.println("Kotak Bank returns "+KMB.getFixedInterestRate()+" % interest rate on Fixed Deposit");

		System.out.println();


		GeneralBank GB;


		GB=new ICICIBank();


		System.out.println("ICICI Bank returns "+GB.getSavingInterestRate()+" % interest rate on Savings Account");

		System.out.println("ICICI Bank returns "+GB.getFixedInterestRate()+" % interest rate on Fixed Deposit");

		System.out.println();


		GB=new KotakMahBank();


		System.out.println("Kotak mahendra Bank returns "+GB.getSavingInterestRate()+" % interest rate on Savings Account");

		System.out.println("Kotak Bank mahendra returns "+GB.getFixedInterestRate()+" % interest rate on Fixed Deposit");


	}

}

