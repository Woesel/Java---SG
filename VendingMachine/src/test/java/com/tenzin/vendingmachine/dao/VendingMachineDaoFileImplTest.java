/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.vendingmachine.dao;

import com.tenzin.vendingmachine.dto.VendingMachineItems;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ttibe
 */
public class VendingMachineDaoFileImplTest {

    private String TEST_FILE = "testInventory.txt";

    VendingMachineDao testDao;
    VendingMachineDaoFileImpl load;

    private Map<String, VendingMachineItems> vm = new HashMap<>();

    public VendingMachineDaoFileImplTest() {

    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        load = new VendingMachineDaoFileImpl();
        testDao = new VendingMachineDaoFileImpl(TEST_FILE);

    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testgetAllItemsMethod() throws VendingMachinePersistenceException {
        //Arrange
        load.loadInventory();
        

        List<VendingMachineItems> allItem = testDao.getAllItems();
        //ASSERT

        assertEquals(3, allItem.size(), "List of items should have 3 items.");

        assertNotNull(allItem);
    }

    @Test
    public void testUpdateItem() throws VendingMachinePersistenceException {
        //ARRANGE
        BigDecimal price = new BigDecimal("10.99");

        //ACT
//        List<VendingMachineItems> allItem = testDao.getAllItems();
        VendingMachineItems updatedItem = testDao.addItem("Chew", new VendingMachineItems("Chew", price, 10));
        updatedItem.setItemCost(price);

        load.loadInventory();

        assertEquals("Chew", updatedItem.getItemName());
        assertEquals(new BigDecimal("10.99"), updatedItem.getItemCost());
        assertEquals(10, updatedItem.getNumOfItems(), "The updated item should be 20");

    }

    @Test
    public void testGetSelectedItem() throws VendingMachinePersistenceException {
        //ARRANGE
        load.loadInventory();
        //ACT
        VendingMachineItems retrievedItem = testDao.getSelectedItems("Chew");
        //ASSERT
        assertEquals("Chew", retrievedItem.getItemName());
        assertEquals(new BigDecimal("10.99"), retrievedItem.getItemCost());
        assertEquals(10, retrievedItem.getNumOfItems());
    }

}
