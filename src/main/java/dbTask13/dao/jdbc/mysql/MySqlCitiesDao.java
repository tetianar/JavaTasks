package dbTask13.dao.jdbc.mysql;

import dbTask13.dao.GenericDao;
import dbTask13.entities.Cities;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class MySqlCitiesDao implements GenericDao<Cities> {
    @Override
    public Cities find(int id) {
        return null;
    }

    @Override
    public List<Cities> findAll() {
        return null;
    }

    @Override
    public void update(Cities entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void insert(Cities entity) {

    }
}
