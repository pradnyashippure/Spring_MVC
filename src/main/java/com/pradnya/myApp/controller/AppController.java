package com.pradnya.myApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pradnya.myApp.dto.DetailsDTO;
import com.pradnya.myApp.dto.ForgetPassDTO;
import com.pradnya.myApp.dto.LoginDTO;
import com.pradnya.myApp.entity.MyAppRegDetails;
import com.pradnya.myApp.services.CommanService;

@Controller
public class AppController {

	@Autowired
	private CommanService service;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(DetailsDTO details) {
		ModelAndView modelAndView = new ModelAndView();
		String msg = service.validateAndSave(details);
		System.out.println(msg);
		modelAndView.addObject("responseMSG", msg);
		modelAndView.setViewName("Home.jsp");
		return modelAndView;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(LoginDTO logdto) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(logdto);
		String response = service.validateAndLogin(logdto);
		System.out.println(response);
		modelAndView.addObject("responseMSG", response);
		if (response.contains(".com")) {
			modelAndView.setViewName("Home.jsp");
		} else {
			modelAndView.setViewName("Login.jsp");
		}

		return modelAndView;
	}
	@RequestMapping(value = "/getMyProfile/{id}" , method =RequestMethod.GET)
	public ModelAndView getMyProfile( @PathVariable("id") String id) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(id);
		MyAppRegDetails res=service.getMyProfile(id);
		modelAndView.addObject("details", res);
		System.out.println(res);
		modelAndView.setViewName("/Home.jsp");
		return modelAndView;
	}
	@RequestMapping(value="/OTP" , method = RequestMethod.POST)
	public ModelAndView sendOtp(String email) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(email);
		String response=service.validateAndSendOtp(email);
		modelAndView.addObject("responseMSG", response);
		modelAndView.setViewName("/ForgetPassword.jsp");
		return modelAndView;
	}
	@RequestMapping(value = "/forgetPassword" ,method= RequestMethod.POST)
	public ModelAndView forgetPassword(ForgetPassDTO fpdto) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(fpdto);
		String response=service.validateAndUpdatePassword(fpdto);
		modelAndView.addObject("responseMSG", response);
		if("Password Updated".equals(response)) {
			modelAndView.setViewName("/Login.jsp");
		}else {
			modelAndView.setViewName("/ForgetPassword.jsp");
		}
		return modelAndView;
	}
}
