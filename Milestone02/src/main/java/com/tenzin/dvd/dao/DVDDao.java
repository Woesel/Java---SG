package com.tenzin.dvd.dao;

import com.tenzin.dvd.dto.DVD;
import java.util.List;

/**
 *
 * @author Tenzin Woesel May 17, 2020
 */
public interface DVDDao {
    
    DVD addDVD(String title, DVD dvd) throws DVDDaoException;
    
    List<DVD> getAllDVD() throws DVDDaoException;
    
    DVD getParticularDVD(String title) throws DVDDaoException;
    
    DVD removeDVD(String title) throws DVDDaoException;
    
    //DVD editDVD(String title,DVD editDVD) throws DVDDaoException;
    
}
