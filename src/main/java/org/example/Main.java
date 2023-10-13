package org.example;

import org.example.consoleApp.WeatherDataAppGUI;
import org.example.dao.LocationDAO;
import org.example.dao.LocationDAOImpl;
import org.example.dao.WeatherDataDAO;
import org.example.dao.WeatherDataDAOImpl;
import org.example.model.Location;
import org.example.model.WeatherData;
import org.example.service.LocationService;
import org.example.service.LocationServiceImpl;
import org.example.service.WeatherDataService;
import org.example.service.WeatherDataServiceImpl;
import org.example.util.HibenateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.json.JSONObject;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {


    public static void main(String args[]) throws ParseException {

        /*SessionFactory factory = HibenateUtil.getSessionFactory();
        Session session = factory.openSession();

        LocationDAO locationDAO = new LocationDAOImpl(factory);
        WeatherDataDAO weatherDataDAO = new WeatherDataDAOImpl(factory);

        LocationService locationService = new LocationServiceImpl(locationDAO);
        WeatherDataService weatherDataService = new WeatherDataServiceImpl(weatherDataDAO);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Main Menu:");
            System.out.println("1. Add a Location");
            System.out.println("2. Display Locations");
            System.out.println("3. Download Weather Data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    try {
                        System.out.println("Enter Latitude: ");
                        double latitude = scanner.nextDouble();
                        System.out.println("Enter Longitude: ");
                        double longitude = scanner.nextDouble();
                        scanner.nextLine(); // Consume the newline character
                        System.out.println("Enter Region: ");
                        String region = scanner.nextLine();
                        System.out.println("Enter Country: ");
                        String country = scanner.nextLine();

                        // Create a new Location
                        Location newLocation = new Location(latitude, longitude, region, country);

                        // Open a Hibernate transaction
                        Transaction tx = session.beginTransaction();

                        // Add the new location
                        locationService.addLocation(newLocation);

                        // Commit the transaction
                        tx.commit();

                        System.out.println("Location added successfully.");
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error adding location: " + e.getMessage());
                    }
                    break;
                case 2:
                    List<Location> locations = locationService.getAllLocations();
                    for (Location location : locations) {
                        System.out.println(location);
                    }
                    break;
                case 3:
                    System.out.println("Enter City: ");
                    String city = scanner.nextLine();

                    // Replace 'YOUR_API_KEY' with your OpenWeatherMap API key
                    String apiKey = "a475956f51851932d5dd2b66dce5f692";

                    // Create a WeatherData object to store the downloaded data
                    WeatherData weatherData = retrieveWeatherDataFromAPI(city, apiKey);

                    if (weatherData != null) {
                        // If data is successfully retrieved from the API, save it to your database
                        weatherDataService.addWeatherData(weatherData);
                        System.out.println("Weather data added successfully.");
                    } else {
                        System.out.println("Failed to retrieve weather data.");
                    }
                    break;
            }
        }
    }

    public static WeatherData retrieveWeatherDataFromAPI(String city, String apiKey) {
        try {
            String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;

            // Open a connection to the URL
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method to GET
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            if (responseCode == 200) {
                // Read the response from the API
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }
                reader.close();

                // Parse the JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());

                // Extract weather data from the JSON response
                double temperature = jsonResponse.getJSONObject("main").getDouble("temp");
                double pressure = jsonResponse.getJSONObject("main").getDouble("pressure");
                double humidity = jsonResponse.getJSONObject("main").getDouble("humidity");
                double windSpeed = jsonResponse.getJSONObject("wind").getDouble("speed");
                double windDirection = jsonResponse.getJSONObject("wind").getDouble("deg");

                // Create a WeatherData object and populate it
                WeatherData weatherData = new WeatherData();
                weatherData.setTemperature(temperature);
                weatherData.setPressure(pressure);
                weatherData.setHumidity(humidity);
                weatherData.setWindSpeed(windSpeed);
                weatherData.setWindDirection(windDirection);

                return weatherData;
            } else {
                System.out.println("Failed to retrieve weather data. HTTP error code: " + responseCode);
            }
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error while fetching weather data.");
        }

        return null; // Return null if retrieval fails
    }
}*/
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WeatherDataAppGUI app = new WeatherDataAppGUI();
                app.display();
            }
        });

    }}
