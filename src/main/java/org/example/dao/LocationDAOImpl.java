package org.example.dao;

import org.example.model.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;


public class LocationDAOImpl implements LocationDAO {

    private SessionFactory sessionFactory;

    public LocationDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Location findById(UUID id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Location.class, id);
    }

    @Override
    public List<Location> findAll() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Location> query = builder.createQuery(Location.class);
            Root<Location> root = query.from(Location.class);
            query.select(root);

            Query<Location> q = session.createQuery(query);
            return q.getResultList();
        }
    }

    @Override
    public void save(Location location) {
        Session session = sessionFactory.getCurrentSession();
        session.save(location);
    }

    @Override
    public void update(Location location) {
        Session session = sessionFactory.getCurrentSession();
        session.update(location);
    }

    @Override
    public void delete(Location location) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(location);
    }
}
