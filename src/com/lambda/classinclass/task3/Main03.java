package com.lambda.classinclass.task03;

public class Main {

	public static void main(String[] args) {

		University03.Student student = new University03.Student();

		student.setId(1);
		student.setName("Константин Павлович Белоусов");

		System.out.println("Student: " + student.getName() + "\nId: " + student.getId());

	}

}
