package com.example.demo;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

@Service
public class StudentsServiceImpl implements StudentsService {
	
    private final Map<String, Student> students =  new ConcurrentHashMap<>();

    public StudentsServiceImpl() {
    	students.put("123", new Student("123", "Robert", "Downey"));
    	students.put("124", new Student("124", "Christian", "Bale"));
    	students.put("125", new Student("125", "Henry", "Cavil"));
    }
    
    @Override
    public Collection<Student>  getAll() {
        return students.values();
    }

    @Override
    public Student create(Student student) {
    	students.put(student.getRollNumber(), student);
        return student;
    }

}
      