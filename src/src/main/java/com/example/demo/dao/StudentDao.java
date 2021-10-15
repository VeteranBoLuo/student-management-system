package com.example.demo.dao;

import com.example.demo.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Long> {
    void deleteByCard(String card);

    Student getByCard(String card);
}
