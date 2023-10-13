package org.example.util;

import org.example.model.Location;
import org.example.model.WeatherData;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibenateUtil {

        public static  SessionFactory sessionFactory;

        public static SessionFactory getSessionFactory() {
            if(sessionFactory==null)
            {
                Configuration configuration = new Configuration();
                Properties properties = new Properties();

                properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                properties.put(Environment.URL, "jdbc:mysql://localhost:3306/weather_lady");
                properties.put(Environment.USER, "root");
                properties.put(Environment.PASS, "root");
                properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
                properties.put(Environment.HBM2DDL_AUTO, "update");
                properties.put(Environment.SHOW_SQL, true);

                configuration.setProperties(properties);
                configuration.addAnnotatedClass(Location.class);
                configuration.addAnnotatedClass(WeatherData.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            }

            return sessionFactory;

        }
    }
