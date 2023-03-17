package com.example.kafkaexample;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "murat")
    void listeners(String data) {
        System.out.println("Listener receiver: " + data);
    }
}
