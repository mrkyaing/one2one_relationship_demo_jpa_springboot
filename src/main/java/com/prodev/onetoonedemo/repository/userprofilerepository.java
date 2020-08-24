package com.prodev.onetoonedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodev.onetoonedemo.entity.userprofile;
@Repository
public interface userprofilerepository extends JpaRepository<userprofile,Long>{

}
