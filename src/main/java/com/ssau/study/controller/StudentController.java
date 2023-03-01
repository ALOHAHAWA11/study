package com.ssau.study.controller;

import com.ssau.study.entity.Student;
import com.ssau.study.repository.JdbcStudentRepository;
import com.ssau.study.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @PatchMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentRepository.updateStudent(student);
    }

    @PostMapping("/create")
    public long createStudent(@RequestBody Student student) {
        return studentRepository.createStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public long deleteStudent(@PathVariable long id) {
        return studentRepository.deleteStudent(id);
    }

}
