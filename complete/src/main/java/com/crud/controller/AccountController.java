package com.crud.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Account;
import com.crud.repository.AccountRepository;

@RestController
@CrossOrigin
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	//create
	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody Account account)
	{
		accountRepository.save(account);
	}
	
	//read one
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Account> read(@PathVariable String id)
	{
		return accountRepository.findById(id);
	}
	
	//read all
	@RequestMapping(method = RequestMethod.GET)
	public List<Account> readall()
	{
		return accountRepository.findAll();
	}
	
	//update
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Account account)
	{
		accountRepository.save(account);
	}
	
	//delete
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id)
	{
		accountRepository.deleteById(id);
	}

}
