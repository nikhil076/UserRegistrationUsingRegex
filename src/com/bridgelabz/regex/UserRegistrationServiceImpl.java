package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationServiceImpl implements UserRegistrationService{

	@Override
	public boolean firstNameRegex(String firstName) {
		String firstNameRegex = "^[A-Z][a-z]{3,}";
		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matched = pattern.matcher(firstName);
		return matched.matches();
	}
}
