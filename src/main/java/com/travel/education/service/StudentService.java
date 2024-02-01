package com.travel.education.service;

import com.travel.education.entity.Student;
import com.travel.education.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {
    @Autowired
    private StudentRepository repository;
    public void insertStudent(Student student) {
        repository.insertStudent(student);
    }
    public void delete(int id) {
        repository.delete(id);
    }

    public void update(Student student) {
        repository.update(student);
    }
    public List<Student> getList(Integer id, String name, String lastname) {
        return repository.getList(id, name,lastname);
    }
    public List<Student> getList() {
        return repository.getList();
    }
    public Student findById(Integer id) {
        return repository.findById(id);
    }
}
