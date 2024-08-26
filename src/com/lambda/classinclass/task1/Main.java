package com.lambda.classinclass.task1;

public class Main {

	public static void main(String[] args) {

		Book b = new Book();

		Book.Author a = b.new Author();

		b.setTitle("Core java");

		a.setName("Cay S. Horstmann");
		a.setAge("59");
		a.printChar();

	}

}
