package com.stark.api.request;

import java.io.Serializable;
import java.math.BigDecimal;


public class AccountRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private BigDecimal creditLimit;
	private String risk;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getCreditLimit() {
		return creditLimit;
	}
	
	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

}
