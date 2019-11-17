package com.init.controllers;

import com.init.model.Student;
import com.init.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<Student> getStudents(@RequestParam(name="studentRollNo") String studentRollNo) throws InterruptedException{

        return new ResponseEntity<>(studentService.getStudents(studentRollNo).get(), HttpStatus.OK);


    }
}
