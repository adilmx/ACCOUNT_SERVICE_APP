package com.adilmx.spring_jaxws_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adilmx.spring_jaxws_app.entity.Account;

public interface AccountService {

	public Account findById(Long id);
	public List<Account> findAll();
	public Account save(Account account);
	public int verser(double mt,Account account);
	public int retirer(double mt,Account account);
}
