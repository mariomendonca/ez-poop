package com.ezpoop.ezpoopbackend.services;

import com.ezpoop.ezpoopbackend.domains.entities.Location;
import com.ezpoop.ezpoopbackend.repositories.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    public Location getById(Long id) {
        Optional<Location> location = locationRepository.findById(id);
        if (location.isEmpty()) {
            return new Location();
//            throw new Exception("Does not exist a location with id " + id);
        }

        return location.get();
    }
}
