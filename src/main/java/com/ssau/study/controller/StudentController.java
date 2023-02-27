package com.ssau.study.controller;

import com.ssau.study.entity.Student;
import com.ssau.study.repository.JdbcStudentRepository;
import com.ssau.study.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/count")
    public int count() {
        return studentRepository.count();
    }

    @GetMapping
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<Student> findAllByName(@PathVariable String name) {
        return studentRepository.findAllByName(name);
    }

    @GetMapping("/student/{id}")
    public Student readStudent(@PathVariable long id) {
        return studentRepository.readStudent(id);
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student)
    {
        return studentRepository.createStudent(student);
    }
}