package com.project.gotogether.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class RideRequest {
    private String riderId;
    private double pickupLat;
    private double pickupLong;
    private double dropLat;
    private double dropLong;
    private int detourLimit;
    private String genderPreference;
    private LocalTime time;
    private LocalDate date;

    public RideRequest(String riderId, double pickupLat, double pickupLong, double dropLat, double dropLong, int detourLimit, String genderPreference, LocalTime time, LocalDate date) {
        this.riderId = riderId;
        this.pickupLat = pickupLat;
        this.pickupLong = pickupLong;
        this.dropLat = dropLat;
        this.dropLong = dropLong;
        this.detourLimit = detourLimit;
        this.genderPreference = genderPreference;
        this.time = time;
        this.date = date;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public double getPickupLat() {
        return pickupLat;
    }

    public void setPickupLat(double pickupLat) {
        this.pickupLat = pickupLat;
    }

    public double getPickupLong() {
        return pickupLong;
    }

    public void setPickupLong(double pickupLong) {
        this.pickupLong = pickupLong;
    }

    public double getDropLat() {
        return dropLat;
    }

    public void setDropLat(double dropLat) {
        this.dropLat = dropLat;
    }

    public double getDropLong() {
        return dropLong;
    }

    public void setDropLong(double dropLong) {
        this.dropLong = dropLong;
    }

    public int getDetourLimit() {
        return detourLimit;
    }

    public void setDetourLimit(int detourLimit) {
        this.detourLimit = detourLimit;
    }

    public String getGenderPreference() {
        return genderPreference;
    }

    public void setGenderPreference(String genderPreference) {
        this.genderPreference = genderPreference;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
