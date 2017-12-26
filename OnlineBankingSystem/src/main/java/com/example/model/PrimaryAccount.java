package com.example.model;

import java.math.BigDecimal;

public class PrimaryAccount {

	
	private int id;

	private PrimaryTransaction primaryTransaction;
	
	public PrimaryTransaction getPrimaryTransaction() {
		return primaryTransaction;
	}
	public void setPrimaryTransaction(PrimaryTransaction primaryTransaction) {
		this.primaryTransaction = primaryTransaction;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	private BigDecimal balance;
	
}
