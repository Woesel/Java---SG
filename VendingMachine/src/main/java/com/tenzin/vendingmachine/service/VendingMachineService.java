
package com.tenzin.vendingmachine.service;

import com.tenzin.vendingmachine.dao.VendingMachinePersistenceException;
import com.tenzin.vendingmachine.dto.VendingMachineItems;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Tenzin Woesel
 * Jun 8, 2020
 */
public interface VendingMachineService {
    
     List<VendingMachineItems> getAllItems() throws VendingMachinePersistenceException;
    
    VendingMachineItems getSelectedItem(String itemName) throws VendingMachineNoItemInventoryException, VendingMachinePersistenceException, VendingMachineDataValidationException;
    
    VendingMachineItems purchasedItem(String itemName, BigDecimal insertedAmount);
    
    Change returnChange(BigDecimal itemCost, BigDecimal insertedAmount) throws VendingMachineInsufficientFundsException;

}
