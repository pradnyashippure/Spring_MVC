package com.pradnya.myApp.dto;

public class DetailsDTO {
	private String email;
	private String password;
	private String confirmPassword;
	private String number;
	
	public DetailsDTO() {
		System.out.println("Default DetailsDTO constructor ");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "DetailsDTO [email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", number=" + number + "]";
	}

}
