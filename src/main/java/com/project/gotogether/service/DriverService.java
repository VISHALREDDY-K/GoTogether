package com.project.gotogether.service;

import com.project.gotogether.entity.Driver;
import com.project.gotogether.model.RequestResponse;
import com.project.gotogether.repository.DriverRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository){
        this.driverRepository  = driverRepository;
    }

    public void saveDriver(Driver driver){
        driverRepository.save(driver);
        System.out.println("Driver saved to DB: " + driver.getDriverId());
    }

    public ResponseEntity<RequestResponse> updateDriverLocation(String driverId, double longitude, double latitude, boolean isAvailable){
        Optional<Driver> optionalDriver = driverRepository.findById(driverId);
        if(optionalDriver.isPresent()){
            Driver driver = optionalDriver.get();
            driver.setLatitude(latitude);
            driver.setLongitude(longitude);
            driver.setAvailable(isAvailable);
            driver.setLastUpdated(LocalDateTime.now());
            driverRepository.save(driver);
            System.out.println("✅ Driver updated: " + driverId);
        }
        else{
            RequestResponse failResponse = new RequestResponse(
                    "failure",
                    "Driver details not Found to update",
                    LocalDateTime.now()
            );

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(failResponse);
        }

        RequestResponse successResponse = new RequestResponse(
                "failure",
                "Driver details not Found to update",
                LocalDateTime.now());

        return ResponseEntity.status(HttpStatus.OK).body(successResponse);
    }
}
