package org.example.dao;

import org.example.model.Location;

import java.util.List;
import java.util.UUID;

public interface LocationDAO {
    Location findById(UUID id);

    List<Location> findAll();

    void save(Location location);

    void update(Location location);

    void delete(Location location);
}
