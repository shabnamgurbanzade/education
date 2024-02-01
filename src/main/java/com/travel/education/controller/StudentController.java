package com.travel.education.controller;

import com.travel.education.entity.Student;
import com.travel.education.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getList(Integer id, String name, String lastname){
        return studentService.getList(id, name, lastname);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(Integer id) {
        final Student student = studentService.findById(id);
        if (student != null) {
            studentService.delete(id);
            return ResponseEntity.status(HttpStatus.OK).body("Student with ID " + id + " was deleted.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student with ID " + id + " not found.");
        }
    }
    @RequestMapping(method = RequestMethod.POST)
    public Student create(@RequestBody Student student) {
        studentService.insertStudent(student);
        return student;
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Student update(@RequestBody Student student) {
        studentService.update(student);
        return student;
    }

}
