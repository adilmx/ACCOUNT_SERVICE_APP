package com.adilmx.spring_jaxws_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adilmx.spring_jaxws_app.entity.Account;
import com.adilmx.spring_jaxws_app.service.AccountService;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountRest {

	@Autowired
	AccountService accountService;

	//all of this rest primary(CRUD) methods are generated automatically using spring data Rest
	//THE JSON RETURNED IS BASED ON JSON HATEOAS (Hypermedia As The Engine of Application State) FORMAT
	/*
	 * @GetMapping("/{id}") public Account findById(@PathVariable(name = "id") Long
	 * id) { return accountService.findById(id); }
	 * 
	 * @GetMapping("/") public List<Account> findAll() { return
	 * accountService.findAll(); }
	 * 
	 * @PostMapping("/") public Account save(@RequestBody Account account) { return
	 * accountService.save(account); }
	 */

	@PostMapping("/verser/{montant}")
	public int verser(@PathVariable(name = "montant") double montant, @RequestBody Account account) {
		return accountService.verser(montant, account);
	}

	@PostMapping("/retirer/{montant}")
	public int retirer(@PathVariable(name = "montant") double montant, @RequestBody Account account) {
		return accountService.retirer(montant, account);
	}

}
