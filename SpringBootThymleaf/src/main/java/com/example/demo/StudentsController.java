package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentsController {
	
    @Autowired
    private StudentsService studentsService;

    @RequestMapping(value = "/index")
    public String index() {
       return "index";
    }

    @GetMapping(value="/students")
    public String getAllStudents(Model model) {
    	model.addAttribute("students", studentsService.getAll());
    	System.out.println(model);
        return "students";
    }
    
    @PostMapping()
    public Student create(@RequestBody Student student) {
        return studentsService.create(student);
    }
}