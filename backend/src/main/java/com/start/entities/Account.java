package com.start.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private BigDecimal creditLimit;
	private String risk;
	private BigDecimal interestRate;

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

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

}
