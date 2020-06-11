/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.carlot.service;

import com.tenzin.carlot.dao.CarLotDAO;
import com.tenzin.carlot.dao.CarLotDaoFileImpl;
import com.tenzin.carlot.dto.Car;
import com.tenzin.carlot.dto.CarKey;
import java.math.BigDecimal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ttibe
 */
public class CarLotServiceImplTest {

    private CarLotService service;
    private CarLotDAO dao;

    public CarLotServiceImplTest() {
        dao = new CarLotDaoFileImpl();
        service = new CarLotServiceImpl(dao);
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

        dao = new CarLotDaoFileImpl();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSellCar() {
        
        Car newCar = new Car("something", "goood", "car", "blue", BigDecimal.ONE, 100, new CarKey("something", true));

    }

}
