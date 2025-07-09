package com.project.gotogether.model;

public class MatchResponse {
    private String driverId;
    private double longitude;
    private double latitude;
    private String vehicleNumber;

    public MatchResponse(String driverId, String vehicleNumber, double latitude, double longitude) {
        this.vehicleNumber = vehicleNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.driverId = driverId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
