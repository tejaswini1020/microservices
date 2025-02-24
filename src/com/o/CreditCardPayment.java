package com.o;

public class CreditCardPayment implements Payment {
	 public void makePayment(double amount) {
	        System.out.println("Paid $" + amount + " using Credit Card.");
	 }
}
