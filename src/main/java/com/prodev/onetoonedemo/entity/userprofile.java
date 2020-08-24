package com.prodev.onetoonedemo.entity;

import java.io.Serializable;
import java.time.LocalDate ;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="userprofile")
public class userprofile implements Serializable{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long userprofileId;
private String phoneNo;
private String address;
@Enumerated(EnumType.STRING)
@Column(name="Gender")
private GENDER 	gender;
private LocalDate dataofbirth;

@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "userprofile")
private user user;

public userprofile(String phoneNo, String address, GENDER gender, LocalDate dataofbirth) {
	super();
	this.phoneNo = phoneNo;
	this.address = address;
	this.gender = gender;
	this.dataofbirth = dataofbirth;
}

public user getUser() {
	return user;
}

public void setUser(user user) {
	this.user = user;
}

public long getUserprifileId() {
	return userprofileId;
}
public void setUserprifileId(long userprifileId) {
	this.userprofileId = userprifileId;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public GENDER getGender() {
	return gender;
}
public void setGender(GENDER gender) {
	this.gender = gender;
}
public LocalDate getDataofbirth() {
	return dataofbirth;
}
public void setDataofbirth(LocalDate dataofbirth) {
	this.dataofbirth = dataofbirth;
}


}
