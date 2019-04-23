package com.stark.api.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stark.api.request.AccountRequest;
import com.stark.api.validator.AccountRequestValidator;
import com.stark.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private AccountRequestValidator validator;
	
	@PostMapping(value = "/v1/account", consumes = APPLICATION_JSON_VALUE)
	public void saveAccount(@RequestBody AccountRequest accountRequest) throws Exception {
		
		validator.validate(accountRequest);
		accountService.save(accountRequest);
	}
	
}
