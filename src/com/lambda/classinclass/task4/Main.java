package com.lambda.classinclass.task04;

public class Main {

	public static void main(String[] args) {

		MathUtils.Factorial r = new MathUtils.Factorial();
		int n = 5;
		r.calculate(n);
		System.out.println(r.calculate(n));

	}

}
