package com.bridgelabz.regex;

public interface UserRegistrationService 
{

	public boolean firstNameRegex(String firstName);
	public boolean lastNameRegex(String lastName);
	public boolean emailRegex(String email);
	public boolean phoneNumberRegex(String phoneNumber);
	public boolean passwordRegex(String password); 
}
