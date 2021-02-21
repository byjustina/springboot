package com.example.demo;
import java.util.*;

import com.example.demo.student.Student;
import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@GetMapping //rest endpoint
//	public List<Student> hello() {
//		return List.of(new Student(1L, "Mariam", LocalDate.of(2000, 12 , 20), 21, "mariam@gmail.com"));
//	}
}
