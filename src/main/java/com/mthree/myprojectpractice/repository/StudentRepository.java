package com.mthree.myprojectpractice.repository;

import com.mthree.myprojectpractice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}