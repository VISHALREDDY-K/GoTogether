package com.project.gotogether.controller;


import com.project.gotogether.model.MatchResponse;
import com.project.gotogether.model.RequestResponse;
import com.project.gotogether.model.RideRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("gotogether/rider")
public class RiderController {

    @PostMapping("/request-ride")
    public ResponseEntity<RequestResponse> requestRide(@RequestBody RideRequest request) {

        System.out.println("🚖 New ride request from rider " + request.getRiderId());

        // 🔥 TODO: Save ride to DB and publish to Kafka topic

        RequestResponse response = new RequestResponse(
                "success",
                "Ride request received successfully",
                LocalDateTime.now()
        );

        return ResponseEntity.ok(response);
    }

    @GetMapping("/matches")
    public ResponseEntity<List<MatchResponse>> getMatches(@RequestParam String riderId){
        System.out.println("Fetching Response for rider: " + riderId);

        List<MatchResponse> matches = new ArrayList<>();
        matches.add(new MatchResponse("D001", "AP 01 KS 001", 17.1,78.1));
        matches.add(new MatchResponse("D002", "AP 02 KS 002", 17.2,78.2));

        return ResponseEntity.ok(matches);
    }

}
