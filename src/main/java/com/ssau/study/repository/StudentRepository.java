package com.ssau.study.repository;

import com.ssau.study.entity.Student;

import java.util.Date;
import java.util.List;

public interface StudentRepository {
    int count();

    List<Student> findAll();

    List<Student> findAllByName(String name);

    Student readStudent(long id);

    long createStudent(Student student);

    Student updateStudent(Student student);

    long deleteStudent(long id);
}
