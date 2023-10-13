package org.example.dao;

import org.example.model.Location;
import org.example.model.WeatherData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.UUID;

public class WeatherDataDAOImpl implements WeatherDataDAO {
    private SessionFactory sessionFactory;

    public WeatherDataDAOImpl(SessionFactory sessionFactory) {
    }

    @Override
    public WeatherData findById(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(WeatherData.class, id);
    }

    @Override
    public List<WeatherData> findByLocation(Location location) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from WeatherData where location = :location", WeatherData.class).list();
    }

    @Override
    public void save(WeatherData weatherData) {
        Session session = sessionFactory.getCurrentSession();
        session.save(weatherData);
    }

    @Override
    public void update(WeatherData weatherData) {
        Session session = sessionFactory.getCurrentSession();
        session.update(weatherData);
    }

    @Override
    public void delete(WeatherData weatherData) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(weatherData);
    }
}
