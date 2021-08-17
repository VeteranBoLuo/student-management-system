package com.example.demo.dao;

import com.example.demo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserDao extends JpaRepository<User,Long> {

   User findByUserName(String userName);
}
