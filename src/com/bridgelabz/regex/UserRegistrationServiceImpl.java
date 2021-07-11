package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationServiceImpl implements UserRegistrationService
{

	@Override
	public boolean firstNameRegex(String firstName) 
	{
		String firstNameRegex = "^[A-Z][a-z]{3,}";
		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matched = pattern.matcher(firstName);
		return matched.matches();
	}

	@Override
	public boolean lastNameRegex(String lastName)
	{
		String firstNameRegex = "^[A-Z][a-z]{3,}";
		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matched = pattern.matcher(lastName);
		return matched.matches();
	}

	@Override
	public boolean emailRegex(String email) 
	{
		String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matched = pattern.matcher(email);
		return matched.matches();
	}

	@Override
	public boolean phoneNumberRegex(String phoneNumber) 
	{
		String phoneNumberRegex = "^[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";
		Pattern pattern = Pattern.compile(phoneNumberRegex);
		Matcher matched = pattern.matcher(phoneNumber);
		return matched.matches();
	}

}
