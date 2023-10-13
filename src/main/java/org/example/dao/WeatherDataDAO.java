package org.example.dao;

import org.example.model.Location;
import org.example.model.WeatherData;

import java.util.List;
import java.util.UUID;

public interface WeatherDataDAO {
    WeatherData findById(UUID id);

    List<WeatherData> findByLocation(Location location);

    void save(WeatherData weatherData);

    void update(WeatherData weatherData);

    void delete(WeatherData weatherData);
}
