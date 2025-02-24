package com.l;

public class Test {
	 static void getAreaTest(Shape s) {
	        System.out.println("Expected area: " + s.getArea());
	    }

	    public static void main(String[] args) {
	        Shape rectangle = new Rectangle(2, 3);
	        getAreaTest(rectangle);

	        Shape square = new Square(5);
	        getAreaTest(square);
	    }

}
