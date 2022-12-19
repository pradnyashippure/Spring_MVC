package com.pradnya.myApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradnya.myApp.dao.DetailsDAO;
import com.pradnya.myApp.dto.DetailsDTO;
import com.pradnya.myApp.dto.ForgetPassDTO;
import com.pradnya.myApp.dto.LoginDTO;
import com.pradnya.myApp.entity.MyAppRegDetails;
import com.pradnya.myApp.Util.MyAppUtils;

@Service
public class CommanServiceImpl implements CommanService{
	
	@Autowired
	private DetailsDAO dao;
	
	@Autowired
	private MyAppUtils util;
	
	public String validateAndSave(DetailsDTO details) {
		
		if(details.getEmail() != null && !details.getEmail().isEmpty()) {
			if(details.getPassword()!= null && !details.getPassword().isEmpty()) {
				if(details.getConfirmPassword() !=null  && !details.getConfirmPassword().isEmpty()
						&& details.getConfirmPassword().equals(details.getPassword())) {
					MyAppRegDetails regDetails = new MyAppRegDetails();
					regDetails.setEmail(details.getEmail());
					regDetails.setPassword(details.getPassword());
					regDetails.setNumber(details.getNumber());
					
					dao.save(regDetails);
					return "Data Saved";
				}else {
					return "Invalid ConfirmPassword";
				}
				
			}else {
				return "Invalid Passwor";
			}
			
		}else {
			return "Invalid Email Id";
		}
		
	}
	
	public String validateAndLogin(LoginDTO logdto) {
		if(logdto.getEmail() != null  && !logdto.getEmail().isEmpty() ) {
 			if(logdto.getPassword() != null && !logdto.getPassword().isEmpty()) {
 				MyAppRegDetails myAppRegDetails=dao.getByEmail(logdto.getEmail());
 				if(logdto.getEmail().equals(myAppRegDetails.getEmail()) 
 						&& logdto.getPassword().equals(myAppRegDetails.getPassword())){
 							return  logdto.getEmail();
 						}else{
 							return "Invalid email or password";
 						}
 				
 			}else {
				return "Invalid Password";
 			}
			}else {
			return "Invalid Email Id";
		}
		
	}

	public MyAppRegDetails getMyProfile(String email) {
		MyAppRegDetails myAppRegDetails = null;
		if(email != null && !email.isEmpty() ) {
			myAppRegDetails=dao.getByEmail(email);
			
		}
		
		return myAppRegDetails;
	}

	public String validateAndSendOtp(String email) {
		if(email != null && !email.isEmpty() ) {
			MyAppRegDetails myAppRegDetails=dao.getByEmail(email);
			if(myAppRegDetails != null ) {
				int otp=util.generateOtp();
				 util.sendMail(email, otp);
				 myAppRegDetails.setoTP(otp);
				 dao.save(myAppRegDetails);
				return "OTP Sent";
			}else {
				return "Email id not registered";
			}
		}else {
			return "Invalid email id";
		}
	}

	public String validateAndUpdatePassword(ForgetPassDTO fpdto) {
		if(fpdto.getEmail() != null && !fpdto.getEmail().isEmpty() ) {
			MyAppRegDetails myAppRegDetails=dao.getByEmail(fpdto.getEmail());
			if(fpdto.getOtp()== myAppRegDetails.getoTP()) {
				if(fpdto.getNewPassword() != null && !fpdto.getNewPassword().isEmpty()) {
					if(fpdto.getNewConfirmPassword() != null && !fpdto.getNewConfirmPassword().isEmpty()
							&& fpdto.getNewConfirmPassword().equals(fpdto.getNewPassword())) {
						
						myAppRegDetails.setPassword(fpdto.getNewPassword());
						myAppRegDetails.setoTP(0);
						dao.save(myAppRegDetails);
						return "Password Updated";
					}else {
						return "Invalid Confirm Password";
					}
				}else {
					return "Invalid Password";
				}
			}else {
				return "You Entered wrong otp";
			}	
	}else {
		return "Invalid Email Id";
	}
}
}	
 				
 			