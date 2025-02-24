package com.wipro.java.microservices.solid;

public class invoice {
	Book book;
	int quantity;
	double discountRate;
	double taxRate;
	double total;
	
	public invoice(Book book , int quantity , double discountRate , double taxRate) {
		this.book = book;
		this.quantity = quantity;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
		this.total = this.calculateTotal();
	}
	public double calculateTotal() {
		double price = ((book.price - book.price*discountRate)* this.quantity);
		double priceWithTaxes = price *(1+taxRate);
		return priceWithTaxes;
	}
	public void printInvoice() {
		System.out.println(quantity + "x" + book.name + " "+ book.price );
		System.out.println("DiscountRate : " + discountRate);
		System.out.println("TaxRate : " + taxRate);
		System.out.println("Total : " + total );
	}
	 public void saveToFile(String fileName) {
	    	
	    }

}
