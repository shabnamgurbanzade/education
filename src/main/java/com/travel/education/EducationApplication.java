package com.travel.education;

import com.travel.education.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EducationApplication{


	public static void main(String[] args) {
		SpringApplication.run(EducationApplication.class, args);
	}

}
