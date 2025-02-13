package com.artur.students.rest.service;



import com.artur.students.rest.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();
    public void saveStudent(Student student);
    public Student getStudent(int id);
    public void deleteStudent(int id);
}
