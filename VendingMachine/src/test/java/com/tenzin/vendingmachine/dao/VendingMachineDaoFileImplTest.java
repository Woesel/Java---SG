/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.vendingmachine.dao;

import com.tenzin.vendingmachine.dto.VendingMachineItems;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ttibe
 */
public class VendingMachineDaoFileImplTest {

    VendingMachineDao testDao;

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
        String testFile = "testInventory.txt";
        new FileWriter(testFile);
        testDao = new VendingMachineDaoFileImpl();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testgetAllItemsMethod() {

        //ARRANGE
        String itemName;

        VendingMachineItems item = new VendingMachineItems("ChewingGum", BigDecimal.TEN, 10);
        VendingMachineItems item1 = new VendingMachineItems("ChewingGum1", BigDecimal.TEN, 10);
        VendingMachineItems item2 = new VendingMachineItems("ChewingGum2", BigDecimal.ZERO, 10);
        
       

        //ACT
        List<VendingMachineItems> allItem = testDao.getAllItems();
        //ASSERT

        assertEquals(3, allItem.size(), "List of items should have 3 items.");

        assertTrue(testDao.getAllItems().contains(item));
        assertTrue(testDao.getAllItems().contains(item1));
        assertTrue(testDao.getAllItems().contains(item2));

    }

}
