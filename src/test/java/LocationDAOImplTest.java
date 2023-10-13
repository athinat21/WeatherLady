/*
import org.example.dao.LocationDAO;
import org.example.dao.LocationDAOImpl;
import org.example.model.Location;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LocationDAOImplTest {
    private LocationDAO locationDAO;

    private
    SessionFactory sessionFactory;


 */
/*   @Before
    public void setUp() {
        // Initialize the DAO with a simple in-memory data structure
        LocationDAOImpl(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }

    }*//*


    @Test
    public void testFindById() {
        // Create a test location and save it to the DAO
        Location testLocation = new Location();
        UUID id = UUID.randomUUID();
        testLocation.setId(id);
        testLocation.setLatitude(40.7128);
        testLocation.setLongitude(-74.0060);
        testLocation.setCountry("USA");

        locationDAO.save(testLocation);

        // Retrieve the location by its ID using the DAO
        Location retrievedLocation = locationDAO.findById(id);

        assertNotNull(retrievedLocation);
        assertEquals(id, retrievedLocation.getId());
        assertEquals(40.7128, retrievedLocation.getLatitude(), 0.001); // Tolerate small differences in double values
        assertEquals(-74.0060, retrievedLocation.getLongitude(), 0.001);
        assertEquals("USA", retrievedLocation.getCountry());
    }

    @Test
    public void testFindAll() {
        // Create and save a few test locations to the DAO
        Location location1 = new Location();
        location1.setLatitude(40.7128);
        location1.setLongitude(-74.0060);
        location1.setCountry("USA");

        Location location2 = new Location();
        location2.setLatitude(51.5074);
        location2.setLongitude(-0.1278);
        location2.setCountry("UK");

        locationDAO.save(location1);
        locationDAO.save(location2);

        // Retrieve all locations using the DAO
        List<Location> locations = locationDAO.findAll();

        assertNotNull(locations);
        assertEquals(2, locations.size());
    }

}
*/
