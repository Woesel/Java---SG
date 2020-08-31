package com.tenzin.flooring.dao;

import com.tenzin.flooring.dto.FMOrder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Jun 27, 2020
 */
public class FMOrderDaoImpl implements FMOrderDao {

    private String DELIMITER = ",";

    private String ORDER_DATA_FOLDER;
    private String ORDER_DATA_FILE;

    private Map<LocalDate, Map<Integer, FMOrder>> orderMap = new HashMap<>();
    //create a seperate map for the innerMap to add into the main map
    private Map<Integer, FMOrder> innerMap = new HashMap<>();

    @Override
    public FMOrder addOrder(FMOrder order) {

        FMOrder newOrder = innerMap.put(order.getOrderNumber(), order);
        FMOrder addOrder = (FMOrder) orderMap.put(order.getOrderDate(), innerMap);
        return addOrder;
    }

    @Override
    public List<FMOrder> getAllOrders(LocalDate orderDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMOrder getSelectedOrder(int orderNumber, LocalDate orderDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FMOrder> getEveryOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMOrder removeOrder(LocalDate orderDate, int orderNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMOrder editOrder(FMOrder order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void writeOrderData() {
    }

    private void loadOrderData() throws IOException{
        
        Scanner scanner;
        try{
            scanner = new Scanner(new BufferedReader(new FileReader(ORDER_DATA_FILE)));
        }catch(FileNotFoundException e){
            throw new IOException("not found");
        }
        
        String currentLine;
        
        FMOrder currentOrder;
        
        while(scanner.hasNextLine()){
            currentLine = scanner.nextLine();
            
        }
        
    }

    private String marshallOrder(FMOrder anOrder) {
        String[] 
        return null;
    }

    private FMOrder unmarshallOrder(String orderAsText) {
        return null;
    }

}
