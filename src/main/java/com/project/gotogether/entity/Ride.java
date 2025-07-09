package com.project.gotogether.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "rides")
public class Ride {

    @Id
    private String rideId;

    private String riderId;  // For now storing as String, you can FK to Rider if you want later
    private String driverId;

    private double pickupLat;
    private double pickupLong;
    private double dropLat;
    private double dropLong;

    private int detourLimit;
    private String genderPreference;

    private LocalDate date;
    private LocalTime time;

    private String status;

    // Constructors
    public Ride() {}

    public Ride(String riderId, String driverId, double pickupLat, double pickupLong, double dropLat, double dropLong,
                int detourLimit, String genderPreference, LocalDate date, LocalTime time, String status) {
        this.riderId = riderId;
        this.driverId = driverId;
        this.pickupLat = pickupLat;
        this.pickupLong = pickupLong;
        this.dropLat = dropLat;
        this.dropLong = dropLong;
        this.detourLimit = detourLimit;
        this.genderPreference = genderPreference;
        this.date = date;
        this.time = time;
        this.status = status;
    }

    // Getters and Setters

    public String getRideId() { return rideId; }
    public void setRideId(String rideId) { this.rideId = rideId; }

    public String getRiderId() { return riderId; }
    public void setRiderId(String riderId) { this.riderId = riderId; }

    public String getDriverId() { return driverId; }
    public void setDriverId(String driverId) { this.driverId = driverId; }

    public double getPickupLat() { return pickupLat; }
    public void setPickupLat(double pickupLat) { this.pickupLat = pickupLat; }

    public double getPickupLong() { return pickupLong; }
    public void setPickupLong(double pickupLong) { this.pickupLong = pickupLong; }

    public double getDropLat() { return dropLat; }
    public void setDropLat(double dropLat) { this.dropLat = dropLat; }

    public double getDropLong() { return dropLong; }
    public void setDropLong(double dropLong) { this.dropLong = dropLong; }

    public int getDetourLimit() { return detourLimit; }
    public void setDetourLimit(int detourLimit) { this.detourLimit = detourLimit; }

    public String getGenderPreference() { return genderPreference; }
    public void setGenderPreference(String genderPreference) { this.genderPreference = genderPreference; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public LocalTime getTime() { return time; }
    public void setTime(LocalTime time) { this.time = time; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}