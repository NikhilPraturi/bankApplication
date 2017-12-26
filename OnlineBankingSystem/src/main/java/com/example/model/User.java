package com.example.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="userid")
	private Long userId;
private Set<Role> role;
	public Set<Role> getRole() {
	return role;
}
public void setRole(Set<Role> role) {
	this.role = role;
}
	@NotNull
@Column(name="firstname")

private int active;
	public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
	private String firstName;
@NotNull
@Column(name="lastname")

private String lastName;
@NotNull
@Size(min=6,max=12)
@Column(name="password")

private String password;
@Email
@Column(name="email")

private String email;
@NumberFormat
private String phone;

private List<Appointment> appointment;
private List<Recipient> recipient;
private PrimaryAccount primaryAccounts;
private SavingsAccount savingsAccounts;
public PrimaryAccount getPrimaryAccounts() {
	return primaryAccounts;
}
public List<Appointment> getAppointment() {
	return appointment;
}
public void setAppointment(List<Appointment> appointment) {
	this.appointment = appointment;
}
public List<Recipient> getRecipient() {
	return recipient;
}
public void setRecipient(List<Recipient> recipient) {
	this.recipient = recipient;
}
public void setPrimaryAccounts(PrimaryAccount primaryAccounts) {
	this.primaryAccounts = primaryAccounts;
}
public SavingsAccount getSavingsAccounts() {
	return savingsAccounts;
}
public void setSavingsAccounts(SavingsAccount savingsAccounts) {
	this.savingsAccounts = savingsAccounts;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

	
	
	
	
}
