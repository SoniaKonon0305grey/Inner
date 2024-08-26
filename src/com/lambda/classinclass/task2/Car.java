package com.lambda.classinclass.task02;

public class Car {

	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	class Engine {
		private String type;

		private String hp;

		public String getType() {
			return type;
		}
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	private String year;

	Engine e = new Engine();





		public void setType(String type) {
			this.type = type;
		}

		public String getHp() {
			return hp;
		}

		public void setHp(String hp) {
			this.hp = hp;
		}

		void printChar() {
			System.out.println("Model: " + model + "\nYear: " + year + "\nEngine: " + e.type + "\nhp:" + e.hp);
		}

	}

}
