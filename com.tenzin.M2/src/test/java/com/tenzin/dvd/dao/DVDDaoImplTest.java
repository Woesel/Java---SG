/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.dvd.dao;

import com.tenzin.dvd.dto.DVD;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ttibe
 */
public class DVDDaoImplTest {

    DVDDao testDao;

    public DVDDaoImplTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        String testFile = "testlibrary.txt";
        //use the FileWriter to quicly blank the file
        new FileWriter(testFile);
        testDao = new DVDDaoImpl(testFile);

    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAddGetAllDVD() throws Exception {
        //Create our first dvd
        DVD firstDVD = new DVD("Something");
        LocalDate releasedDate = LocalDate.parse("10-20-2012", DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        firstDVD.setDirectorName("Tenzin");
        firstDVD.setMPAARating("PG-13");
        firstDVD.setReleaseDate(releasedDate);
        firstDVD.setStudio("Woesel's production");
        firstDVD.setUserRating("Awesome");

        //Create our second DVD
        DVD secondDVD = new DVD("Avatar");
        LocalDate releasedDate2 = LocalDate.parse("10-20-2013", DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        secondDVD.setDirectorName("Daniel");
        secondDVD.setMPAARating("PG-13");
        secondDVD.setReleaseDate(releasedDate2);
        secondDVD.setStudio("USA production");
        secondDVD.setUserRating("Awesome and great.");
        //Add both to the DAO
        testDao.addDVD(firstDVD.getTitle(), firstDVD);
        testDao.addDVD(secondDVD.getTitle(), secondDVD);

        //Retrieve the list of DVD
        List<DVD> allDVD = testDao.getAllDVD();

        //first check the general content of the list
        assertNotNull(allDVD, "The list of DVD shouldn't be null.");
        assertEquals(2, allDVD.size(), "List of DVD should have 2 dvd.");

        //Then the specific
        assertTrue(testDao.getAllDVD().contains(firstDVD), "The list of dvd should include Something.");
        assertTrue(testDao.getAllDVD().contains(secondDVD), "The list of dvd should include Avatar.");

    }

    @Test
    public void testAddGetParticularDVD() throws Exception {

        //Create our first dvd
        DVD firstDVD = new DVD("Something");
        LocalDate releasedDate = LocalDate.parse("10-20-2012", DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        firstDVD.setDirectorName("Tenzin");
        firstDVD.setMPAARating("PG-13");
        firstDVD.setReleaseDate(releasedDate);
        firstDVD.setStudio("Woesel's production");
        firstDVD.setUserRating("Awesome");

        //Create our second DVD
        DVD secondDVD = new DVD("Avatar");
        LocalDate releasedDate2 = LocalDate.parse("10-20-2013", DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        secondDVD.setDirectorName("Daniel");
        secondDVD.setMPAARating("PG-13");
        secondDVD.setReleaseDate(releasedDate2);
        secondDVD.setStudio("USA production");
        secondDVD.setUserRating("Awesome and great.");

        //Add both to the DAO
        testDao.addDVD(firstDVD.getTitle(), firstDVD);
        testDao.addDVD(secondDVD.getTitle(), secondDVD);

        //Retrieve the list of DVD
        List<DVD> allDVD = testDao.getAllDVD();

        //first check the general content of the list
        assertNotNull(allDVD, "The list of DVD shouldn't be null.");
        assertEquals(2, allDVD.size(), "List of DVD should have 2 dvd.");
        
        //the specific
        assertEquals(testDao.getParticularDVD("Avatar"), secondDVD);
        assertEquals(testDao.getParticularDVD("Something"), firstDVD);

    }
    
    @Test
    public void testRemoveDVD() throws Exception{
        
        //Create our first dvd
        DVD firstDVD = new DVD("Something");
        LocalDate releasedDate = LocalDate.parse("10-20-2012", DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        firstDVD.setDirectorName("Tenzin");
        firstDVD.setMPAARating("PG-13");
        firstDVD.setReleaseDate(releasedDate);
        firstDVD.setStudio("Woesel's production");
        firstDVD.setUserRating("Awesome");

        //Create our second DVD
        DVD secondDVD = new DVD("Avatar");
        LocalDate releasedDate2 = LocalDate.parse("10-20-2013", DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        secondDVD.setDirectorName("Daniel");
        secondDVD.setMPAARating("PG-13");
        secondDVD.setReleaseDate(releasedDate2);
        secondDVD.setStudio("USA production");
        secondDVD.setUserRating("Awesome and great.");

        //Add both to the DAO
        testDao.addDVD(firstDVD.getTitle(), firstDVD);
        testDao.addDVD(secondDVD.getTitle(), secondDVD);

        //Retrieve the list of DVD
        List<DVD> allDVD = testDao.getAllDVD();

        //first check the general content of the list
        assertNotNull(allDVD, "The list of DVD shouldn't be null.");
        assertEquals(2, allDVD.size(), "List of DVD should have 2 dvd.");
        
        //Now the specific
        DVD removedDVD = testDao.removeDVD("Something");
        
        assertEquals(removedDVD, firstDVD, "The removed DVD should be Something.");

    }

}
