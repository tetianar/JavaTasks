package daoTask13.dao.jdbc.mysql;

import daoTask13.dao.BusesDao;
import daoTask13.entities.Buses;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class MySqlBusesDao implements BusesDao {

    @Override
    public Buses find(int id) {
        return null;
    }

    @Override
    public List<Buses> findAll() {
        return null;
    }



    @Override
    public void update(Buses entity) {
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void insert(Buses entity) {

    }

    @Override
    public List<Buses> findByNumberOfSeats(int minNumber) {
        return null;
    }
}
