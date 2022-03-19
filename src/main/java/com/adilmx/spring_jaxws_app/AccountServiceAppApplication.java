package com.adilmx.spring_jaxws_app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adilmx.spring_jaxws_app.entity.Account;
import com.adilmx.spring_jaxws_app.entity.TypeAccount;
import com.adilmx.spring_jaxws_app.repository.AccountRepo;
import com.adilmx.spring_jaxws_app.service.AccountService;

@SpringBootApplication
public class AccountServiceAppApplication implements CommandLineRunner{
	@Autowired
	AccountService accountService;

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountService.save(new Account(null, "ac-1",1000, new Date(), TypeAccount.AVAILABLE));
		accountService.save(new Account(null, "ac-2",2000, new Date(), TypeAccount.AVAILABLE));
		accountService.save(new Account(null, "ac-3",3000, new Date(), TypeAccount.AVAILABLE));
		accountService.findAll().forEach(account -> {
			System.out.println(account);
		});
	}

}
