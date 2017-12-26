package com.example.model;

import java.math.BigDecimal;

public class SavingsAccount {
private int id;
private SavingsTransaction savingsTransaction;
public SavingsTransaction getSavingsTransaction() {
	return savingsTransaction;
}
public void setSavingsTransaction(SavingsTransaction savingsTransaction) {
	this.savingsTransaction = savingsTransaction;
}
private BigDecimal balance;
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

}
