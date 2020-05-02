package com.example.demo;


import java.util.Collection;

public interface StudentsService {

    Collection<Student> getAll();
    Student create(Student user);

}