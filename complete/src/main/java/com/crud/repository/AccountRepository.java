package com.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crud.model.Account;


public interface AccountRepository extends MongoRepository <Account, String>{
	
}
