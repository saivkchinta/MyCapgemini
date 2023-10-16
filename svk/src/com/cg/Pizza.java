package com.cg;

public class Pizza {
	
		String size;
		int rate;
		int quantity;

		public Pizza(String size, int rate, int quantity) {

			super();

			this.size = size;

			this.rate = rate;

			this.quantity = quantity;

		}
		@Override

		public boolean equals(Object obj) {


			Pizza p= (Pizza)obj;

			if(this.size.equals(p.getSize()))

					return true;

			return false;

		}


		public String getSize() {

			return size;

		}

		public void setSize(String size) {

			this.size = size;

		}
		public int getRate() {

			return rate;

		}

		public void setRate(int rate) {

			this.rate = rate;

		}

		public int getQnt() {

			return quantity;

		}
		public void setQnt(int qnt) {

			this.quantity = qnt;

		}

		@Override

		public String toString() {

			return "Pizza [size=" + size + ", rate=" + rate + ", qnt=" + quantity + "]";

		}

	}


