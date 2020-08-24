package com.prodev.onetoonedemo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prodev.onetoonedemo.entity.GENDER;
import com.prodev.onetoonedemo.entity.user;
import com.prodev.onetoonedemo.entity.userprofile;
import com.prodev.onetoonedemo.repository.userRepository;
import com.prodev.onetoonedemo.repository.userprofilerepository;

@SpringBootApplication
public class OnetoonedemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OnetoonedemoApplication.class, args);
	}
@Autowired
private userRepository userreop;
@Autowired
private userprofilerepository userprofilerepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userprofile userprofile=new userprofile("09256275319","ygn",GENDER.MALE,LocalDate.of(1991, 01, 01));		
		user user=new user("Mg Kyaing","mr.kyaing7@gmail.com",userprofile);
		
		user.setUserprofile(userprofile);
		userprofile.setUser(user);  
		
		userreop.save(user);
	}

}
