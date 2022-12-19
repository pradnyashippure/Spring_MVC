package com.pradnya.myApp.dto;

public class LoginDTO {
	private String email;
	private String password;
	
	public LoginDTO() {
		System.out.println("Invokind LoginDTO constructor");
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

	@Override
	public String toString() {
		return "LoginDTO [email=" + email + ", password=" + password + "]";
	}
	
}
