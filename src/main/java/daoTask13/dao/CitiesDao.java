package daoTask13.dao;



import daoTask13.entities.Cities;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public interface CitiesDao extends GenericDao {
    List<Cities> findByName(String name);
}
