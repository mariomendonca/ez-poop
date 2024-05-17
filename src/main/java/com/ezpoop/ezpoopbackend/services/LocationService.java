package com.ezpoop.ezpoopbackend.services;

import com.ezpoop.ezpoopbackend.domains.entities.Location;
import com.ezpoop.ezpoopbackend.repositories.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }
}
