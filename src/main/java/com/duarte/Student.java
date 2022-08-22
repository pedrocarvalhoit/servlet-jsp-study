package com.duarte;

public class Student {
	
	private int number;
	private String name;
	
	public Student(int i, String string) {
		this.number = i;
		this.name = string;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
	

}
