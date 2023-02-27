package dao;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.dao.IQuery;
import org.example.dao.StockDAO;
import org.example.model.Stock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

@DisplayName("DAO First Test")
class T1_StockDAO {
    @Test
    void t1_rowCount() {
        System.out.println("Muhammad Faizan Abbasi "+new Date());
        IQuery <Stock> Query = new StockDAO();
        List<Stock> list = Query.findAll();
        int size = list.size();
        boolean status = size >4000;
        list.stream().limit(10).forEach(System.out::println);
        assertTrue(status, "Size is equal to size: "+size);
    }
}