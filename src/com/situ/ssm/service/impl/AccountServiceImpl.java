package com.situ.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.ssm.dao.IAccountDao;
import com.situ.ssm.service.IAccountService;


@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	
	private IAccountDao accountDao;

	@Override
	public void transfer(Integer fromAccount, Integer toAccount, Integer money) {
		accountDao.decreaseMoney(fromAccount, money);
		accountDao.increaseMoney(toAccount, money);
	}

}
