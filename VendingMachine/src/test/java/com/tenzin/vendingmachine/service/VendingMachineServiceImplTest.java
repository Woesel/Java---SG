/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.vendingmachine.service;

import com.tenzin.vendingmachine.dao.VendingMachineAuditDao;
import com.tenzin.vendingmachine.dao.VendingMachineDao;
import com.tenzin.vendingmachine.dto.VendingMachineItems;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ttibe
 */
public class VendingMachineServiceImplTest {

    private VendingMachineService service;

    public VendingMachineServiceImplTest() {
        VendingMachineDao dao = new VendingMachineDaoStubImpl();
        VendingMachineAuditDao auditDao = new VendingMachineAudiDaoStubImpl();

        service = new VendingMachineServiceImpl(dao, auditDao);
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetAllItem() throws Exception {

        //ARRANGE
        VendingMachineItems testClone = new VendingMachineItems("KurKure", new BigDecimal("2.99"), 10);
        VendingMachineItems testClone1 = new VendingMachineItems("Wai Wai", new BigDecimal("2.99"), 0);

        List<VendingMachineItems> list = service.getAllItems();
        //ACT & ASSERT
        assertEquals(2, list.size(), "Should only have 1 item.");
        assertTrue(service.getAllItems().contains(testClone));
        assertFalse(service.getAllItems().contains(testClone1));
    }

    @Test
    public void testPurchaseItem() throws Exception {
        //ARRANGE 
        VendingMachineItems testClone = new VendingMachineItems("KurKure", new BigDecimal("2.99"), 10);

        //ACT& ASSERT
        service.purchasedItem("KurKure", new BigDecimal("22"));

    }

}
