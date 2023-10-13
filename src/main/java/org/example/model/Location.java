package org.example.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id; // You can use Long or UUID depending on your requirements
    private double latitude;
    private double longitude;
    private String region;
    private String country;

    // Constructors, getters, and setters

    public Location() {
        // Default constructor
    }

    public Location(double latitude, double longitude, String region, String country) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.region = region;
        this.country = country;
    }

    // Getters and setters for all fields

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}