package com.web.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
