package daoTask13.service;

import daoTask13.TripsService;
import daoTask13.dao.TripsDao;
import daoTask13.entities.Trips;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/7/2016.
 */
public class TripsServiceTest {

    public void testIncrease(){
        TripsService service = new TripsService();
        service.setDao( new TripsDao(){

            @Override
            public List<Trips> findByPrice(double price) {
                return Arrays.asList(new Trips() , new Trips() );
            }

            @Override
            public Trips find(int id) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public List<Trips> findAll() {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public void update(Trips entity) {
                // TODO Auto-generated method stub

            }

            @Override
            public void delete(int id) {
                // TODO Auto-generated method stub

            }

            @Override
            public void insert(Trips entity) {
                // TODO Auto-generated method stub

            }



        });
        List<Trips> res = service.addIncreaseValueToPrice(1, 1);


    }
}
