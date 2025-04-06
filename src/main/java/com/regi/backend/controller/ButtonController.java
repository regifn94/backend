package com.regi.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/button")
@CrossOrigin(origins = "http://localhost:5173")
public class ButtonController {

    int i = 0;

    @PostMapping("/press")
    public String buttonPressed(@RequestParam String status) {
        System.out.println(i++ +" Button Status: " + status);
        return "Received";
    }

    @PostMapping("/throttle")
    public ResponseEntity<String> receiveThrottle(@RequestBody Map<String, Object> payload) {
        System.out.println("Received Throttle: " + payload.get("throttle"));
        return ResponseEntity.ok("Throttle received: " + payload.get("throttle"));
    }
}