/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.dvd.dao;

import com.tenzin.dvd.dto.DVD;
import java.util.List;

/**
 *
 * @author ttibe
 */
public interface DVDDao {
    
    /**
     * Adds the given DVD to the library and associate it with the given title.
     * 
     * @param title
     * @param dvd
     * @return
     * @throws DVDDaoException 
     */
    DVD addDVD(String title, DVD dvd) throws DVDDaoException;
    
    List<DVD> getAllDVD() throws DVDDaoException;
    
    DVD getParticularDVD(String title) throws DVDDaoException;
    
    DVD removeDVD(String title) throws DVDDaoException;    
}
