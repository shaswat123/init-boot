package com.kafka.producer;

import com.init.model.Student;
import com.kafka.producer.service.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerApplication  implements CommandLineRunner {

	@Autowired
	private KafkaSender kafkaSender;

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student();
		student.setStudentName("Shaswat");
		student.setStudentClass("2");
		student.setStudentRollNo("100");
		kafkaSender.sendData(student);


	}
}
