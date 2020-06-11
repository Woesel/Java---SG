package com.tenzin.vendingmachine.service;

import com.tenzin.vendingmachine.dao.VendingMachineAuditDao;
import com.tenzin.vendingmachine.dao.VendingMachineDao;
import com.tenzin.vendingmachine.dao.VendingMachinePersistenceException;
import com.tenzin.vendingmachine.dto.VendingMachineItems;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public class VendingMachineServiceImpl implements VendingMachineService {

    VendingMachineDao dao;
    VendingMachineAuditDao audit;

    public VendingMachineServiceImpl(VendingMachineDao dao, VendingMachineAuditDao audit) {
        this.dao = dao;
        this.audit = audit;
    }

    @Override
    public List<VendingMachineItems> getAllItems() throws VendingMachinePersistenceException {
        List<VendingMachineItems> allItems = dao.getAllItems();
        return allItems;
    }

    @Override
    public VendingMachineItems getSelectedItem(String itemName) throws VendingMachineNoItemInventoryException, VendingMachinePersistenceException, VendingMachineDataValidationException {
        return dao.getSelectedItems(itemName);

    }

    @Override
    public VendingMachineItems purchasedItem(String itemName, BigDecimal insertedAmount) {
        //item = dao.getSelectedItems(itemName);
        //compare price itemCost.compareTo(insertedMoney)
        //
        //return item;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public Change returnChange(BigDecimal itemCost, BigDecimal insertedAmount) throws VendingMachineInsufficientFundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void validateVendingMachineData(VendingMachineItems item) throws VendingMachineDataValidationException {

        if (item.getItemName() == null
                || item.getItemName().trim().length() == 0
                || item.getItemCost().compareTo(BigDecimal.ONE) <= 0
                || item.getNumOfItems() == 0) {
            throw new VendingMachineDataValidationException("Error: All fields{Item name, item cost} are required.");
        }
    }

}               
