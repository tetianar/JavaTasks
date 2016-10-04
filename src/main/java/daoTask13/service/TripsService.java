package daoTask13.service;

import daoTask13.dao.DaoFactory;
import daoTask13.dao.TripsDao;
import daoTask13.entities.Trips;

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

    public List<Trips> findByPrice(double price){
        List<Trips> list = dao.findByPrice(price);
        return list;}

    public List<Trips> addIncreaseValueToPrice(double price , int increaseValue ){
        List<Trips> list = dao.findByPrice(price);
        for(Trips t : list ){
            t.setPrice(t.getPrice()+increaseValue );
        }
        return list;
    }

    public Trips findById(int id){
        Trips list = dao.find(id);
        return list;
    }

    public List<Trips> findAll(){
        List<Trips> list = dao.findAll();
        return list;
    }

    public void update(Trips trip){
        dao.update(trip);
    }

    public void insert(Trips tripForInsert){
        dao.insert(tripForInsert);
    }

    public void deleteById(int id){
        dao.delete(id);
    }

}
