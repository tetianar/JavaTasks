package daoTask13.service;

import daoTask13.dao.TripsDao;
import daoTask13.entities.Trips;
import daoTask13.TripsService;
import org.junit.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Tetiana_Romaniv on 10/7/2016.
 */
public class TripsServiceMokitoTest {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Test
    public void testTripsListWithIncrease(){
        TripsService service = new TripsService();
        TripsDao dao = mock(TripsDao.class);
        service.setDao(dao);
        Date date = new Date();


        when(dao.findByPrice(1000)).thenReturn(
                Arrays.asList(new Trips(1,date,date,1000,2,1),new Trips(1,date,date,2000,2,1)));
        List<Trips> actual = service.addIncreaseValueToPrice(1000,100);
        assertEquals (Arrays.asList(new Trips(1,date,date,1100,2,1) , new Trips(1,date,date,2100,2,1)), actual);

    }
}
