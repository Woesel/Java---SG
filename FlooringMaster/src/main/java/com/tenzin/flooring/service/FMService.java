
package com.tenzin.flooring.service;

import com.tenzin.flooring.dto.FMOrder;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Tenzin Woesel
 * Jun 25, 2020
 */
public interface FMService {
    
    public List <FMOrder> getAllOrders(LocalDate orderDate);
    
    public FMOrder addOrder(FMOrder order);
    
    public FMOrder getSelectedOrder(int orderNumber); 
    
    public void removeOrder(int orderNumber);
    
    public void editOrder(FMOrder order);
    
    public FMOrder performCalculation(FMOrder order);
    
    public int generateOrderNumber();
    
    public void validateOrder();

}
