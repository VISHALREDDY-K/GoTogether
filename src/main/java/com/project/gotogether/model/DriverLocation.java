package com.project.gotogether.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class DriverLocation {
    private String userId;
    private int neighbourhood;
    private LocalTime time;
    private LocalDate date;
    private double longitude;
    private double latitude;
    private boolean isAvailable;

    public DriverLocation(String userId, int neighbourhood, LocalTime time, LocalDate date, double longitude, double latitude, boolean isAvailable) {
        this.userId = userId;
        this.neighbourhood = neighbourhood;
        this.time = time;
        this.date = date;
        this.longitude = longitude;
        this.latitude = latitude;
        this.isAvailable = isAvailable;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(int neighbourhood) {
        this.neighbourhood = neighbourhood;
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

}
