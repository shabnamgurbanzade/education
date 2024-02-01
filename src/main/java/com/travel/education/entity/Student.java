package com.travel.education.entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student{
    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "age", nullable = true)
    private transient Integer age;
    @Column(name = "email")
    private String email;
    @Column(name = "scholarship")
    private Double scholarship;
    @Column(name = "university")
    private String university;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Student setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Student setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public Double getScholarship() {
        return scholarship;
    }

    public Student setScholarship(Double scholarship) {
        this.scholarship = scholarship;
        return this;
    }

    public String getUniversity() {
        return university;
    }

    public Student setUniversity(String university) {
        this.university = university;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }




}
