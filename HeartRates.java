package com.programmingexercises.kh.ch3.three_sixteen;

public class HeartRates {
	
	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int year;
	
	public HeartRates(String firstName, String lastName, int month, int day, int year) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int calculateAge(int year) {
		int currentYear = 2019;
		return currentYear - year;
	}

	// Calculate maximum heart rate (220 - age(years))
	public int calculateMaxHeartRate(int year) {
		int heartConst = 220;
		return  heartConst - (2019 - year);
	}
	
	// Calculate target heart rate (50 - 85% of maximum heart rate)
	public int minTargetHR(int hr) {

		return (int) (hr * .5);
	}
	
	public int maxTargetHR(int hr) {

		return (int) (hr * .85);
	}

}
