package com.kafka.producer.controller;

import com.init.model.Student;
import com.kafka.producer.service.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaProducer")
public class KafkaProducerController {

    @Autowired
    private KafkaSender kafkaSender;

    @PostMapping
    public ResponseEntity<String>sendData(@RequestBody Student student){


        kafkaSender.sendData(student);

        return ResponseEntity.ok("Data sent to kafka");

    }
}
