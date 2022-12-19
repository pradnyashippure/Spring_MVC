package com.pradnya.myApp.Util;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MyAppUtils {
	
	@Autowired
	private JavaMailSender mailSender;
 
	public int generateOtp() {
		Random random = new Random();
		String otp =String.format("%04d", random.nextInt(9999));
		System.out.println(otp);
		
		return Integer.parseInt(otp);
	}
	
	public void sendMail(String to , int otp) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setFrom("youremailid@gmail.com");
		mailMessage.setSubject("OTP for your MyApp reset password");
		mailMessage.setText("your otp is" + otp);
		mailSender.send(mailMessage);
	}
}
