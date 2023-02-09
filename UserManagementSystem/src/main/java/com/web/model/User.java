package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.ui.Model;

@Entity
public class User {
	
	@Id
	private Integer id;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String address;
	public User() {
		super();
	}
	//PDC+PPC+PSM+PGM+toString
	
	public User(Integer id, String name, String email, String password, String gender, String address,User u,Model m) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", address=" + address + "]";
	}
	
	

}
