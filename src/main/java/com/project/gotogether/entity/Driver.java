package com.project.gotogether.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;

@Entity
@Table(name="drivers")
public class Driver {
       @Id
       @GeneratedValue(strategy = GenerationType.UUID)
       private String driverId;
       private String name;
       private String gender;
       private String phoneNumber;
       private double longitude;
       private double latitude;
       private boolean isAvailable;
       private LocalDateTime lastUpdated;

       public Driver(){}

    public Driver(String name, String gender, String phoneNumber, double longitude, double latitude, boolean isAvailable, LocalDateTime lastUpdated) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.longitude = longitude;
        this.latitude = latitude;
        this.isAvailable = isAvailable;
        this.lastUpdated = lastUpdated;
    }

    public String getDriverId(){return driverId;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
