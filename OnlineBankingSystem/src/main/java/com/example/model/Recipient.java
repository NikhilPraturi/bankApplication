package com.example.model;

import javax.persistence.Entity;

@Entity
public class Recipient {
private int recipientId;
private String recipientName;
private String recipientEmail;
private String recipientPhone;
private String recipientAccountNumber;
public int getRecipientId() {
	return recipientId;
}
public void setRecipientId(int recipientId) {
	this.recipientId = recipientId;
}
public String getRecipientName() {
	return recipientName;
}
public void setRecipientName(String recipientName) {
	this.recipientName = recipientName;
}
public String getRecipientEmail() {
	return recipientEmail;
}
public void setRecipientEmail(String recipientEmail) {
	this.recipientEmail = recipientEmail;
}
public String getRecipientPhone() {
	return recipientPhone;
}
public void setRecipientPhone(String recipientPhone) {
	this.recipientPhone = recipientPhone;
}
public String getRecipientAccountNumber() {
	return recipientAccountNumber;
}
public void setRecipientAccountNumber(String recipientAccountNumber) {
	this.recipientAccountNumber = recipientAccountNumber;
}

	
}
