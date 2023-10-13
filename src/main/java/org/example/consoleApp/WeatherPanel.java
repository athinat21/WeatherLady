package org.example.consoleApp;

import org.example.model.WeatherData;

import javax.swing.*;
import java.awt.*;

public class WeatherPanel extends JPanel {
    private JLabel temperatureLabel = new JLabel("Temperature: ");
    private JLabel pressureLabel = new JLabel("Pressure: ");
    private JLabel humidityLabel = new JLabel("Humidity: ");
    private JLabel windSpeedLabel = new JLabel("Wind Speed: ");
    private JLabel windDirectionLabel = new JLabel("Wind Direction: ");

    private JLabel temperatureValueLabel = new JLabel();
    private JLabel pressureValueLabel = new JLabel();
    private JLabel humidityValueLabel = new JLabel();
    private JLabel windSpeedValueLabel = new JLabel();
    private JLabel windDirectionValueLabel = new JLabel();

    public WeatherPanel() {
        setLayout(new GridLayout(3, 2));
        add(temperatureLabel);
        add(temperatureValueLabel);
        add(pressureLabel);
        add(pressureValueLabel);
        add(humidityLabel);
        add(humidityValueLabel);
        add(windSpeedLabel);
        add(windSpeedValueLabel);
        add(windDirectionLabel);
        add(windDirectionValueLabel);
    }

    public void updateWeatherData(WeatherData weatherData) {
        temperatureValueLabel.setText("Temperature: " + weatherData.getTemperature());
        pressureValueLabel.setText("Pressure: " + weatherData.getPressure());
        humidityValueLabel.setText("Humidity: " + weatherData.getHumidity());
        windSpeedValueLabel.setText("Wind Speed: " + weatherData.getWindSpeed());
        windDirectionValueLabel.setText("Wind Direction: " + weatherData.getWindDirection());
    }
}
