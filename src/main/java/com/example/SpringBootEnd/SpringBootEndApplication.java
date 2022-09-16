package com.example.SpringBootEnd;

import com.example.SpringBootEnd.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringBootEndApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext;
				applicationContext = SpringApplication.run(SpringBootEndApplication.class, args);
		Student student1 = new Student("Emina", "emina@gmail.com", 32);
		Student student2 = new Student("Bill", "bill@gmail.com", 22);

	}

}
