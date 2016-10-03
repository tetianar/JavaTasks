package dbTask13.service;

import dbTask13.dao.BusesDao;
import dbTask13.dao.DaoFactory;
import dbTask13.entities.Buses;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class BusesService {
    private static BusesService instance;

    private static BusesDao dao = DaoFactory.getInstance().createBusesDao();
    BusesService(){super();}
    void setDao(BusesDao dao){this.dao = dao;}

    public static BusesService getInstance(){
        if (instance == null){
            instance = new BusesService();
        }
        return instance;
    }

    /*List<Buses> getBusesWithAirCond (boolean hasAirCond){
        List<Buses> list = dao.findByNumberOfSeats(minNumber);
        for(Buses b: list){
            //
        }
        return list;
    }*/
}
