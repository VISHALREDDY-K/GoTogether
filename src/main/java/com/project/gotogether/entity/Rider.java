package com.project.gotogether.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "riders")
public class Rider {

    @Id
    private String riderId;

    private String name;

    private String gender;

    private String phoneNumber;

    // Constructors
    public Rider() {}

    public Rider(String name, String gender, String phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters

    public Long getRiderId() { return riderId; }
    public void setRiderId(String riderId) { this.riderId = riderId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}