package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegistrationMain {

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration using Regex");
		UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Name :");
		System.out.println(userRegistrationService.firstNameRegex(scanner.next()));
	}

}
