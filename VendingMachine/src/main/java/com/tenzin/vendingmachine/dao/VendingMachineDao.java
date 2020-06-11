package com.tenzin.vendingmachine.dao;

import com.tenzin.vendingmachine.dto.VendingMachineItems;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Tenzin Woesel Jun 8, 2020
 */
public interface VendingMachineDao {

    List<VendingMachineItems> getAllItems() throws VendingMachinePersistenceException;

    VendingMachineItems getSelectedItems(String itemName) throws VendingMachinePersistenceException;

    VendingMachineItems purchasedItem(String itemName, BigDecimal insertedAmount) throws VendingMachinePersistenceException;
    
    VendingMachineItems updateItem(String itemName, VendingMachineItems item) throws VendingMachinePersistenceException;
}
