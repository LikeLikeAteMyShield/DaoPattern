package com.jonnyc.daopattern;

import com.jonnyc.daopattern.model.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void addStudent(Student student);
    public void deleteStudent(Student student);
}
