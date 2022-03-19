package com.adilmx.spring_jaxws_app.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adilmx.spring_jaxws_app.entity.Account;
import com.adilmx.spring_jaxws_app.repository.AccountRepo;
import com.adilmx.spring_jaxws_app.service.AccountService;


@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
    private AccountRepo accountRepo;	
	
	
	@Override
	public Account findById(Long id) {
		return accountRepo.findById(id).get();
	}

	@Override
	public List<Account> findAll() {
		return accountRepo.findAll();
	}

	@Override
	public Account save(Account account) {
		return accountRepo.save(account);
	}

	@Override
	public int verser(double mt, Account account) {
		account.setSolde(account.getSolde() + mt);
		return 1;
	}

	@Override
	public int retirer(double mt, Account account) {
		account.setSolde(account.getSolde() - mt);
		return 1;
	}

}
