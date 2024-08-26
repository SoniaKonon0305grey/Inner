package com.lambda.classinclass.task07;

public class Main {

	public static void main(String[] args) {

		double rad = 2;

		Shape cir = new Shape() {

			@Override
			public double ar() {
				return rad * rad * Math.PI;
			}

		};

		System.out.println("circle area with radius " + rad + " : " + cir.ar());

	}

}
