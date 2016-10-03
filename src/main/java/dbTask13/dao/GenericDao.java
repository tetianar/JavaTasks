package dbTask13.dao;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public interface GenericDao<T> {
    T find(int id);
    List<T> findAll();
    void update(T entity);
    void delete(int id);
    void insert(T entity);
}
