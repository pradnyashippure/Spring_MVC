package com.pradnya.myApp.dto;

public class ForgetPassDTO {
	
	private String email;
	private int otp;
	private String newPassword;
	private String newConfirmPassword;
	
	public ForgetPassDTO() {
		System.out.println("ForgetPassDTO()");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getNewConfirmPassword() {
		return newConfirmPassword;
	}

	public void setNewConfirmPassword(String newConfirmPassword) {
		this.newConfirmPassword = newConfirmPassword;
	}

	@Override
	public String toString() {
		return "ForgetPassDTO [email=" + email + ", otp=" + otp + ", newPassword=" + newPassword
				+ ", newConfirmPassword=" + newConfirmPassword + "]";
	}
}
