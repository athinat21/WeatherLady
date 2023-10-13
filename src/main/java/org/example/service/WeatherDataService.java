package org.example.service;

import org.example.model.Location;
import org.example.model.WeatherData;

import java.util.List;
import java.util.UUID;

public interface WeatherDataService {
    WeatherData getWeatherDataById(UUID id);

    List<WeatherData> getWeatherDataForLocation(Location location);

    void addWeatherData(WeatherData weatherData);

    void updateWeatherData(WeatherData weatherData);

    void deleteWeatherData(WeatherData weatherData);
}
