package com.yedam.stream.collect;

public class Student {
	
	public enum Gender{MALE, FEMALE}
	public enum City{Seoul, Busan}
	
	String name;
	int score;
	Gender gender;
	City city;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Student(String name, int score, Gender gender) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
	}
	public Student(String name, int score, Gender gender, City city) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
	}


	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}

	public Gender getGender() {
		return gender;
	}

	public City getCity() {
		return city;
	}
	
	
}
