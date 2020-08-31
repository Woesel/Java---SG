
package com.tenzin.flooring.dao;

import com.tenzin.flooring.dto.FMOrder;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Tenzin Woesel
 * Jun 25, 2020
 */
public interface FMOrderDao {
    
    public FMOrder addOrder(FMOrder order);
            
    public List<FMOrder> getAllOrders(LocalDate orderDate);
            
    public FMOrder getSelectedOrder(int orderNumber, LocalDate orderDate );
    
    public List<FMOrder> getEveryOrder();
            
    public FMOrder removeOrder(LocalDate orderDate, int orderNumber );
    
    public FMOrder editOrder(FMOrder order);
}


