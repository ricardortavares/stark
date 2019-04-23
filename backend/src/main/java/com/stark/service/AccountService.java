package com.stark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stark.api.request.AccountRequest;
import com.stark.repository.AccountRepositoryDB;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepositoryDB repository;
	
	public void save(AccountRequest entity) {
		repository.save(entity);
	}
	
}
