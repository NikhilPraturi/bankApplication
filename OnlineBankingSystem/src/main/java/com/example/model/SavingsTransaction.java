package com.example.model;

public class SavingsTransaction {
	private int id;
	private String transactionType;
	private String transactionName;
	private String transactionDate;
	private String transactionDescription;
	private String transactionLocation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionName() {
		return transactionName;
	}
	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionDescription() {
		return transactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
	public String getTransactionLocation() {
		return transactionLocation;
	}
	public void setTransactionLocation(String transactionLocation) {
		this.transactionLocation = transactionLocation;
	}

}
