package com.project.gotogether.utils;

import com.project.gotogether.model.RequestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class ResponseUtil {
    public static ResponseEntity<RequestResponse> success(String message) {
        return ResponseEntity.ok(new RequestResponse("success", message, LocalDateTime.now()));
    }

    public static ResponseEntity<RequestResponse> failure(String message) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new RequestResponse("failure", message, LocalDateTime.now()));
    }
}
