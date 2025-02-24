package com.wipro.java.microservices.solid;

import java.io.FileWriter;
import java.io.IOException;

public class InvoicePersistence {
    public void saveToFile(invoice Invoice, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(Invoice.quantity + "x " + Invoice.book.name + "\t\t" + Invoice.book.price + "\n");
            writer.write("Discount Rate: " + Invoice.discountRate + "\n");
            writer.write("Tax Rate: " + Invoice.taxRate + "\n");
            writer.write("Total: " + Invoice.total + "\n");
            System.out.println("Invoice saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving invoice: " + e.getMessage());
        }
    }
    
    }
