package com.project.gotogether.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public <T> void publishEvent(String topic, T message) {
        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topic, message);

        future.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("✅ Sent to topic: " + topic +
                        " | Message: " + message +
                        " | Offset: " + result.getRecordMetadata().offset());
            } else {
                System.err.println("❌ Failed to send to topic: " + topic +
                        " | Error: " + ex.getMessage());
            }
        });
    }
}
