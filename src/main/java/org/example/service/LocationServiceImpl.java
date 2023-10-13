package org.example.service;

import org.example.dao.LocationDAO;
import org.example.model.Location;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.UUID;

import static org.example.util.HibenateUtil.sessionFactory;

public class LocationServiceImpl implements LocationService{

    private LocationDAO locationDAO;

    public LocationServiceImpl(LocationDAO locationDAO) {
        this.locationDAO = locationDAO;
    }

    @Override
    public Location getLocationById(UUID id) {
        return locationDAO.findById(id);
    }

    @Override
    public List<Location> getAllLocations() {
        return locationDAO.findAll();
    }

    @Override
    public void addLocation(Location location) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(location);
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
    public void updateLocation(Location location) {
        locationDAO.update(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationDAO.delete(location);
    }
}
