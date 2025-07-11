package com.project.gotogether.controller;


import com.project.gotogether.entity.Driver;
import com.project.gotogether.kafka.KafkaProducerService;
import com.project.gotogether.model.DriverLocation;
import com.project.gotogether.model.RequestResponse;
import com.project.gotogether.service.DriverService;
import com.project.gotogether.utils.ResponseUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/gotogether/driver")
public class DriverController {

    private final DriverService driverService;

    private final KafkaProducerService kafkaProducerService;


    public DriverController(DriverService driverService, KafkaProducerService kafkaProducerService){
        this.driverService = driverService;
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/create")
    public ResponseEntity<RequestResponse> createDriver(@RequestBody Driver driver){
        driverService.saveDriver(driver);

        return ResponseUtil.success("Driver successfully created ✅");
    }

    @PostMapping("/location-update")
    public ResponseEntity<RequestResponse> updateLocation(@RequestBody DriverLocation request){

        System.out.println("🚖 Driver location update:");
        System.out.println("👉 DriverId: " + request.getUserId());
        System.out.println("👉 Location: " + request.getLatitude() + ", " + request.getLongitude());
        System.out.println("👉 Neighbourhood: " + request.getNeighbourhood());
        System.out.println("👉 Date: " + request.getDate() + " Time: " + request.getTime());
        System.out.println("👉 Available: " + request.isAvailable());

        kafkaProducerService.publishEvent("driver-location-updates", request);


        driverService.updateDriverLocation(request.getUserId(),
                request.getLongitude(),
                request.getLatitude(),
                request.isAvailable());

        return ResponseUtil.success("Driver location updated successfully ✅");
    }

}
