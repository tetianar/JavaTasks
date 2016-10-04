package daoTask13.dao;


import daoTask13.entities.*;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public interface BusesDao extends GenericDao<Buses>{
    List<Buses> findByNumberOfSeats (int minNumber);
}
