package com.prodev.onetoonedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodev.onetoonedemo.entity.user;
@Repository
public interface userRepository extends JpaRepository<user,Long>{

}
