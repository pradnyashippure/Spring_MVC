package com.pradnya.myApp.services;

import com.pradnya.myApp.dto.DetailsDTO;
import com.pradnya.myApp.dto.ForgetPassDTO;
import com.pradnya.myApp.dto.LoginDTO;
import com.pradnya.myApp.entity.MyAppRegDetails;

public interface CommanService {
	public String validateAndSave(DetailsDTO details);
	
	public String validateAndLogin(LoginDTO logdto) ;
	
	public MyAppRegDetails getMyProfile(String email);

	public String validateAndSendOtp(String email);
	
	public String validateAndUpdatePassword(ForgetPassDTO fpdto);
}
