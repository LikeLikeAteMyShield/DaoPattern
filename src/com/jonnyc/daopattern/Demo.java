package com.jonnyc.daopattern;

import com.jonnyc.daopattern.model.Student;

public class Demo {

    public static void main(String[] args) {

        StudentDao studentDao = new StudentDaoImpl();

        for(Student student : studentDao.getAllStudents()){
            System.out.println("Name: " + student.getName());
        }

        Student student = studentDao.getStudent(1);
        System.out.println(student.getName());
    }
}
