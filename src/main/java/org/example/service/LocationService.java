package org.example.service;

import org.example.model.Location;

import java.util.List;
import java.util.UUID;

public interface LocationService {
    Location getLocationById(UUID id);

    List<Location> getAllLocations();

    void addLocation(Location location);

    void updateLocation(Location location);

    void deleteLocation(Location location);
}
