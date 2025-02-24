package com.o;

public class PaymentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Payment creditCard = new CreditCardPayment();
        creditCard.makePayment(100.50);

        Payment payPal = new PayPalPayment();
        payPal.makePayment(75.25);
    

	}

}
