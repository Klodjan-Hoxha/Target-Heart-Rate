package com.programmingexercises.kh.ch3.three_sixteen;

import java.util.Scanner;

public class HeartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner object
		Scanner input = new Scanner(System.in);
		
		// Variables
		String firstName, lastName;
		int month, day, year, maxHR;
		
		// Prompt user
		System.out.println("Enter your first name, last name, month, day and year: ");
		firstName = input.nextLine();
		lastName = input.nextLine();
		month = input.nextInt();
		day = input.nextInt();
		year = input.nextInt();
		
		// Empty space
		System.out.println();
		
		// Instantiate object
		HeartRates hr = new HeartRates(firstName, lastName, month, day, year);
		
		// Store maximum heart rate in variable
		maxHR = hr.calculateMaxHeartRate(year);
		
		// Display info
		System.out.println("Your detailed information:");
		System.out.printf("%s, %s%n"
				+ "Birthday: %d,%d,%d%nYou are %d years old%n"
				+ "Your maximum heart rate is %d BPM.%n"
				+ "Your target heart rate is between %d and %d BPM.",hr.getFirstName(),
				hr.getLastName(), hr.getMonth(), hr.getDay(), hr.getYear(), hr.calculateAge(year),
				maxHR, hr.minTargetHR(maxHR), hr.maxTargetHR(maxHR));
		

	}

}
