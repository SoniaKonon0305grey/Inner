package com.lambda.classinclass.task02;

public class Main {

	public static void main(String[] args) {

		Car c = new Car();

		c.setModel("Nissan GTR31");
		c.setYear("1990");
		c.e.setType("RB26");
		c.e.setHp("280");

		c.printChar();

	}

}
