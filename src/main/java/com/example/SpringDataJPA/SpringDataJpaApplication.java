package com.example.SpringDataJPA;

import com.example.SpringDataJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Maseera");
//		s1.setMarks(81);
//
//		s2.setRollNo(102);
//		s2.setName("Anabia");
//		s2.setMarks(87);
//
//		s3.setRollNo(103);
//		s3.setName("Mirha");
//		s3.setMarks(94);
//
////		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

		System.out.println(repo.findAll());

	}

}
