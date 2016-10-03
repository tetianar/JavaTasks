package dbTask13.service;

import dbTask13.dao.DaoFactory;
import dbTask13.dao.OrdersDao;
import dbTask13.entities.Orders;

import java.util.List;

/**
 * Created by Tetiana_Romaniv on 10/3/2016.
 */
public class OrdersService {
    private static OrdersService instance;
    private static OrdersDao dao = DaoFactory.getInstance().createOrdersDao();

    OrdersService(){super();}
    void setDao(OrdersDao dao){this.dao = dao;}

    public static OrdersService getInstance(){
        if (instance == null){
            instance = new OrdersService();
        }
        return instance;
    }



}
