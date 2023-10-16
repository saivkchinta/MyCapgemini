package com.cg;

import java.util.Scanner;

public class Ticket {


	private int ticketid;

	private int price;

	private static int availableTickets;

	public int getTicketid() {

		return ticketid;

	}

	public void setTicketid(int ticketid) {

		this.ticketid = ticketid;

	}

	public int getPrice() {

		return price;

	}

	public void setPrice(int price) {

		this.price = price;

	}

	public static int getAvailableTickets() {

		return availableTickets;

	}

	public static void setAvailableTickets(int availableTickets) {

		if (availableTickets>0) {

			Ticket.availableTickets = availableTickets;

		}


	}

	public int calculateTicketCost(int nooftickets) {


		if (nooftickets < availableTickets) {


			availableTickets = availableTickets-nooftickets;

			return nooftickets*price;

		}

		else {

			return -1;

		}

	}

	public static void main(String args[]) {


		Scanner s= new Scanner(System.in);


		System.out.println("Enter no of bookings: ");

		int bookings = s.nextInt();

		System.out.println("Enter available tickets: ");

		int availableTickets = s.nextInt();


		Ticket ticket = new Ticket();

		Ticket.setAvailableTickets(availableTickets);


		for (int i=1;i<=bookings;i++) {


			System.out.println("Enter Ticket Id: ");

			int ticketid=s.nextInt();


			System.out.println("Enter Ticket price: ");

			int price=s.nextInt();

			System.out.println("Enter number of tickets: ");

			int nooftickets = s.nextInt();


			ticket.setTicketid(ticketid);

			ticket.setPrice(price);


			System.out.println("Available Tickets: "+Ticket.getAvailableTickets());


			int cost = ticket.calculateTicketCost(nooftickets);

			System.out.println("Total Amount: "+cost);

			System.out.println("Available Tickets after booking: "+Ticket.getAvailableTickets());


		}



	}

 

}

