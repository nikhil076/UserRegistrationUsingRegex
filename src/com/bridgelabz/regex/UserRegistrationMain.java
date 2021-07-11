package com.bridgelabz.regex;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRegistrationMain 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to User Registration using Regex");
		UserRegistrationService userRegistrationService = new UserRegistrationServiceImpl();
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the First Name :");
//		System.out.println(userRegistrationService.firstNameRegex(scanner.next()));
//		System.out.println("Enter the Last Name :");
//		System.out.println(userRegistrationService.lastNameRegex(scanner.next()));
//		
//		ArrayList<String> validEmails = new ArrayList<>();
//		validEmails.add("abc@yahoo.com");
//		validEmails.add("abc-100@yahoo.com");
//		validEmails.add("abc.100@yahoo.com");
//		validEmails.add("abc111@abc.com");
//		validEmails.add("abc-100@abc.net");
//		validEmails.add("abc.100@abc.com.au");
//		validEmails.add("abc@gmail.com.com");
//		validEmails.add("abc+100@gmail.com");
//		System.out.println("Checking all the valid email examples");
//		for (String string : validEmails) 
//		{
//			System.out.println(string + " :"+userRegistrationService.emailRegex(string));
//		}
//		
//		System.out.println("\nChecking all the invalid email examples");
//		ArrayList<String> inValidEmails = new ArrayList<>();
//		inValidEmails.add("abc");
//		inValidEmails.add("abc@.com.my");
//		inValidEmails.add("abc123@gmail.a");
//		inValidEmails.add("abc123@.com");
//		inValidEmails.add("abc123@.com.com");
//		inValidEmails.add(".abc@abc.com");
//		inValidEmails.add("abc()*@gmail.com");
//		inValidEmails.add("abc@%*.com");
//		inValidEmails.add("abc..2002@gmail.com");
//		inValidEmails.add("abc.@gmail.com");
//		inValidEmails.add("abc@abc@gmail.com");
//		inValidEmails.add("abc@gmail.com.1a");
//		inValidEmails.add("abc@gmail.com.aa.au");
//		for (String string : inValidEmails) 
//		{
//			System.out.println(string+" :"+userRegistrationService.emailRegex(string));
//		}
//		
//		System.out.println("Enter phone Number :");
//		System.out.println(userRegistrationService.phoneNumberRegex(scanner.next()));
		
		System.out.println("Enter the password :");
		System.out.println(userRegistrationService.passwordRegex(scanner.next()));
	}
}
