package com.prodev.onetoonedemo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user implements Serializable{

private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long userId;
	private String name,email;
	
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="userprofileId")
	private userprofile userprofile;

	public user(String name, String email,userprofile userprofile) {
		super();
		this.name = name;
		this.email = email;
		this.userprofile = userprofile;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public userprofile getUserprofile() {
		return userprofile;
	}

	public void setUserprofile(userprofile userprofile) {
		this.userprofile = userprofile;
	}
	
	
}
