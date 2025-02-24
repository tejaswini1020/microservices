package com.o;

public class PayPalPayment implements Payment {
	 public void makePayment(double amount) {
	        System.out.println("Paid $" + amount + " using PayPal.");
	    }

}
