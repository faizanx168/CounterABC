package org.example.dao;

import com.jbbwebsolution.excel.FileUtility;
import org.example.model.Stock;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class StockDAO implements IQuery<Stock>{
    private static String fileName = "file://"+"/Users/faiza/IdeaProjects/JavaPractice/Stocks.csv";
    @Override
    public List<Stock> findAll() {
        try{
            URL url = new URL(fileName);
            FileUtility<Stock> fileUtility = new FileUtility<>(url);
            List<Stock> listOfStock = fileUtility.readFromResources(2,Stock::new);
            return listOfStock;
        }catch (Exception e){
         e.printStackTrace();
        }
        return new ArrayList<>();
    }
}

