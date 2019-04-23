package com.stark.api.validator;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.stark.api.request.AccountRequest;

@Component
public class AccountRequestValidator {
	
	public void validate(AccountRequest accountRequest) throws Exception {
		if(StringUtils.isBlank(accountRequest.getName())) {
			throw new Exception("Innapropriate use of: name");
		}
		
		if(StringUtils.isBlank(accountRequest.getRisk())) {
			throw new Exception("Innapropriate use of: risk");
		}
		
		if(accountRequest.getCreditLimit().compareTo(BigDecimal.ZERO) == 0) {
			throw new Exception("Innapropriate use of: creditLimit");
		}
	}

}
