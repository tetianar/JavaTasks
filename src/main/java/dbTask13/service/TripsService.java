package dbTask13.service;

import dbTask13.dao.DaoFactory;
import dbTask13.dao.TripsDao;
import dbTask13.entities.Trips;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class TripsService {
    private static TripsService instance;
    private static TripsDao dao = DaoFactory.getInstance().createTripsDao();

    TripsService(){super();}
    void setDao(TripsDao dao){this.dao = dao;}

    public static TripsService getInstance(){
        if (instance == null){
            instance = new TripsService();
        }
        return instance;
    }

    public List<Trips> addIncreaseValueToPrice(int price , int increaseValue ){
        List<Trips> list = dao.findByPrice(price);
        for(Trips t : list ){
            t.setPrice(t.getPrice()+increaseValue );
        }
        return list;
    }
}
