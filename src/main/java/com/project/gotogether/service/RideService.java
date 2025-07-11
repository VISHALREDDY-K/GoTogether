package com.project.gotogether.service;

import com.project.gotogether.entity.Ride;
import com.project.gotogether.repository.RideRepository;
import org.springframework.stereotype.Service;

@Service
public class RideService {

    private final RideRepository rideRepository;

    public RideService(RideRepository rideRepository){
        this.rideRepository = rideRepository;
    }

    public void saveRide(Ride ride){
        rideRepository.save(ride);
        System.out.println("Ride saved to DB: " + ride.getRideId());
    }


}
