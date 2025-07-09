package com.project.gotogether.service;

import com.project.gotogether.entity.Driver;
import com.project.gotogether.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository){
        this.driverRepository  = driverRepository;
    }

    public void updateDriverLocation(String driverId, double longitude, double latitude, boolean isAvailable){
        Optional<Driver> optionalDriver = driverRepository.findById(driverId);
        if(optionalDriver.isPresent()){
            Driver driver = optionalDriver.get();
            driver.setLatitude(latitude);
            driver.setLongitude(longitude);
            driver.setAvailable(isAvailable);
            driver.setLastUpdated(LocalDateTime.now());
            driverRepository.save(driver);
            System.out.println("✅ Driver updated: " + driverId);
        } else {
            Driver driver = new Driver();
            driver.setName("Driver " + driverId);
            driver.setPhoneNumber("0000000000");
            driver.setGender("NA");
            driver.setLatitude(latitude);
            driver.setLongitude(longitude);
            driver.setAvailable(isAvailable);
            driver.setLastUpdated(LocalDateTime.now());
            driverRepository.save(driver);
            System.out.println("✅ New Driver created: " + driverId);
        }
    }
}
