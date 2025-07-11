package com.project.gotogether.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    @Value(value = "${spring.kafka.bootstrap-servers}")
    private String bootstrapAdresss;

    @Bean
    public KafkaAdmin kafkaAdmin(){
        Map<String, Object> config = new HashMap<>();
        config.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAdresss);
        return new KafkaAdmin(config);
    }

    @Bean
    public NewTopic topic1(){
        return new NewTopic("driver-location-updates",1 , (short) 1 );
    }

    @Bean
    public NewTopic topic2(){
        return new NewTopic("ride-requests",1 , (short) 1 );
    }

    @Bean
    public NewTopic topic3(){
        return new NewTopic("ride-status-updates",1 , (short) 1 );
    }

}
