package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;

/**
 * 管理员
 */
@Entity
@Getter
@Setter
public class User implements Serializable {

     @Id
     @GeneratedValue(strategy= GenerationType.IDENTITY)
     private Long id;

     @Column(name = "name", nullable = false)
     private  String name;

     @Column(name = "username", nullable = true)
     private String userName;

     @Column(name = "password",nullable = true)
     private  String password;

}
