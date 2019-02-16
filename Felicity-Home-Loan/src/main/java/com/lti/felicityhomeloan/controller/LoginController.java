package com.lti.felicityhomeloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.felicityhomeloan.dto.LoginDTO;
import com.lti.felicityhomeloan.service.LoginService;

@RestController
@CrossOrigin
public class LoginController {

	@Autowired
	private LoginService loginService;

	@CrossOrigin
	@RequestMapping(path = "/login/userlogin", method = RequestMethod.POST)
	public String loginUser(@RequestBody LoginDTO loginDTO) {
		boolean isValidUser = loginService.validateUser(loginDTO);

		if (isValidUser) {
			return "{\"status\" : \"Logged in Successfully!\"}";
		} else {
			return "{\"status\" : \"Username or password invalid!\"}";
		}
	}
}
