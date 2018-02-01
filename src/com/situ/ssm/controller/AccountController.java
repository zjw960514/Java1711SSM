package com.situ.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.ssm.service.IAccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private IAccountService accountService;
	
	@RequestMapping("/transfer")
	public void transfer(Integer fromAccount,Integer toAccount,Integer money) {
		accountService.transfer( fromAccount, toAccount, money);
	}
}
