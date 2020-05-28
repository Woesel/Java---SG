
package com.tenzin.dvd;

import com.tenzin.dvd.controller.DVDController;
import com.tenzin.dvd.dao.DVDDao;
import com.tenzin.dvd.dao.DVDDaoImpl;
import com.tenzin.dvd.ui.DVDView;
import com.tenzin.dvd.ui.UserIO;
import com.tenzin.dvd.ui.UserIOConsoleImpl;

/**
 *
 * @author Tenzin Woesel
 * May 17, 2020
 */
public class App {
    
    public static void main(String[] args) {
        
        //Declare UserIO and initialize it with UserIOConsoleImpl reference
        UserIO myIo = new UserIOConsoleImpl();
        //Declare and instantiate a DVDView object, pass myIo into the constructor 
        DVDView myView = new DVDView(myIo);
        //Declare DVDDao and initialize it with DVDDaoImpl reference
        DVDDao myDao = new DVDDaoImpl();
        //Instantiate DVDController and pass the DVDDao and DVDView object into the constructor
        DVDController controller = new DVDController(myDao, myView);
        //Call the run method
        controller.run();
    }

}
