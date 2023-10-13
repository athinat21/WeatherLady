package org.example.service;

import org.example.dao.WeatherDataDAO;
import org.example.model.Location;
import org.example.model.WeatherData;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.UUID;

import static org.example.util.HibenateUtil.sessionFactory;

public class WeatherDataServiceImpl implements WeatherDataService{
    private WeatherDataDAO weatherDataDAO;

    public WeatherDataServiceImpl(WeatherDataDAO weatherDataDAO) {
        this.weatherDataDAO = weatherDataDAO;
    }

    @Override
    public WeatherData getWeatherDataById(UUID id) {
        return weatherDataDAO.findById(id);
    }

    @Override
    public List<WeatherData> getWeatherDataForLocation(Location location) {
        return weatherDataDAO.findByLocation(location);
    }

    @Override
    public void addWeatherData(WeatherData weatherData) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(weatherData);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
    }

    @Override
    public void updateWeatherData(WeatherData weatherData) {
        weatherDataDAO.update(weatherData);
    }

    @Override
    public void deleteWeatherData(WeatherData weatherData) {
        weatherDataDAO.delete(weatherData);
    }
}
