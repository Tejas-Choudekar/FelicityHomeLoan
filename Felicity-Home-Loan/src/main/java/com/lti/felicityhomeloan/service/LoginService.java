package com.lti.felicityhomeloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.felicityhomeloan.dto.LoginDTO;
import com.lti.felicityhomeloan.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;
	
	@Transactional
	public boolean validateUser(LoginDTO loginDTO) {
		if(loginRepository.fetchUser(loginDTO)!=null)
			return true;
		return false;
	}
}
