package com.bankui.beans;

import org.springframework.stereotype.Component;

@Component
public class Deposit {
	private String fromAccountNumber;
	private double amount;


	public String getFromAccountNumber() {
		return fromAccountNumber;
	}

	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Deposit [fromAccountNumber=" + fromAccountNumber + ", amount=" + amount + "]";
	}

	public double getAmount() {
		return amount;
	}
	
}