package daoTask13.dao;


import daoTask13.entities.Trips;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public interface TripsDao extends GenericDao <Trips>{
    List<Trips> findByPrice(double price);
}
