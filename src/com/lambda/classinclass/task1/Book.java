package com.lambda.classinclass.task1;

public class Book {

	private String title1;

	public String getTitle() {
		return title1;
	}

	public void setTitle(String title) {
		this.title1 = title1;
	}

	class Author {

		private String nameAuth;

		public String getName() {
			return nameAuth;
		}

		public void setName(String nameAuth) {
			this.nameAuth = nameAuth;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		private String age;

		void printChar() {

			System.out.println(" Book: " + title1 + " \n Age: " + age + " \n Author: " + nameAuth );
		}
	}

}
