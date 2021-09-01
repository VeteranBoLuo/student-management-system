package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
/**
 * 学生
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card", nullable = false)
    private String card;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "phone", nullable = false)
    private String phone;


    public Student(String card, String name, String sex, String phone) {
        this.card=card;
        this.name=name;
        this.sex=sex;
        this.phone=phone;
    }
}
