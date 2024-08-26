package com.lambda.classinclass.task05;

public class Main {

	public static void main(String[] args) {

		Greeting g = new Greeting() {

			@Override
			public void printHello() {
				System.out.println("Hello, Java!");
			}

		};

		g.printHello();

	}

}
