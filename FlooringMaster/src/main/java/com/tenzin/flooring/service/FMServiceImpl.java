
package com.tenzin.flooring.service;

import com.tenzin.flooring.dao.FMOrderAuditDao;
import com.tenzin.flooring.dao.FMOrderDao;
import com.tenzin.flooring.dto.FMOrder;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Tenzin Woesel
 * Jul 7, 2020
 */
public class FMServiceImpl implements FMService{
    
    public FMOrderAuditDao auditDao;
    public FMOrderDao dao; 

    @Override
    public List<FMOrder> getAllOrders(LocalDate orderDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMOrder addOrder(FMOrder order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMOrder getSelectedOrder(int orderNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeOrder(int orderNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editOrder(FMOrder order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FMOrder performCalculation(FMOrder order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int generateOrderNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validateOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
