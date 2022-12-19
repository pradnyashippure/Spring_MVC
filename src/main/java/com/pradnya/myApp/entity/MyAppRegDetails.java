package com.pradnya.myApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myappdtls")
public class MyAppRegDetails {
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name ="email")
	private String email;
	@Column (name ="password")
	private String password;
	@Column (name ="contact")
	private String number;
	@Column (name = "otp")
	private int oTP;
	
	public MyAppRegDetails() {
		System.out.println("myappregdetails constructor");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getoTP() {
		return oTP;
	}
	public void setoTP(int oTP) {
		this.oTP = oTP;
	}
	@Override
	public String toString() {
		return "MyAppRegDetails [id=" + id + ", email=" + email + ", password=" + password + ", number=" + number + "]";
	}
}
