package com.cg;
import java.util.*;
import java.lang.*;
public class Bankdetails {
	public static void main(String[] args) {
	int accountbalance = 500;
	int deposit = 200;
	int onlinepayment = 300;
	int afterdeposit = Math.addExact(accountbalance,deposit);
	System.out.println("Available balance after deposit: "+afterdeposit);
	System.out.println("Available balance after withdrawal: "+Math.subtractExact(afterdeposit, onlinepayment));
	}
}


