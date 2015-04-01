package com.jonnyc.daopattern;

import com.jonnyc.daopattern.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    private List<Student> students;

    public StudentDaoImpl(){

        students = new ArrayList<Student>();

        Student student1 = new Student("Jonny", 0);
        Student student2 = new Student("Chris", 1);
        Student student3 = new Student("Phil", 2);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    @Override
    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    public Student getStudent(int rollNo){
        return students.get(rollNo);
    }

    @Override
    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public void deleteStudent(Student student){
        students.remove(student.getRollNo());
    }
}
