package com.ezpoop.ezpoopbackend.controllers;

import com.ezpoop.ezpoopbackend.domains.entities.Location;
import com.ezpoop.ezpoopbackend.services.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/locations")
@AllArgsConstructor
public class LocationController {
    private final LocationService locationService;

    @PostMapping
    public ResponseEntity<Location> createLocation(@RequestBody Location location) {
        return ResponseEntity.status(HttpStatus.CREATED).body(locationService.createLocation(location));
    }
}
