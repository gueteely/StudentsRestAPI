package com.artur.students.rest.controller;

import com.artur.students.rest.entity.Student;
import com.artur.students.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        Student student = studentService.getStudent(id);
        return student;
    }
}
