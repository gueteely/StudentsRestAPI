package com.artur.students.rest.controller;

import com.artur.students.rest.entity.Student;
import com.artur.students.rest.exception_handler.NoSuchStudentException;
import com.artur.students.rest.exception_handler.StudentIncorrectData;
import com.artur.students.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        if (student == null) {
            throw new NoSuchStudentException("There is no student with id " + id +
                    " in the database");
        }
        return student;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }
}
