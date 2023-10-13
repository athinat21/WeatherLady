package org.example.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "weather_data")
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // You can use Long or another suitable ID type

    private Date date;
    private double temperature;
    private double pressure;
    private double humidity;
    private double windDirection;
    private double windSpeed;

    // Constructors, getters, and setters

    public WeatherData() {
        // Default constructor
    }

    public WeatherData(Date date, double temperature, double pressure, double humidity, double windDirection, double windSpeed) {
        this.date = date;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
    }

    // Getters and setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(double windDirection) {
        this.windDirection = windDirection;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "id=" + id +
                ", date=" + date +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", windDirection=" + windDirection +
                ", windSpeed=" + windSpeed +
                '}';
    }
}