package com.tenzin.dvd;

import com.tenzin.dvd.controller.DVDController;
import com.tenzin.dvd.dao.DVDDao;
import com.tenzin.dvd.dao.DVDDaoImpl;
import com.tenzin.dvd.ui.DVDView;
import com.tenzin.dvd.ui.UserIO;
import com.tenzin.dvd.ui.UserIOConsoleImpl;

/**
 *
 * @author Tenzin Woesel May 17, 2020
 */
public class App {

    public static void main(String[] args) {

        UserIO myIo = new UserIOConsoleImpl();
        DVDView myView = new DVDView(myIo);
        DVDDao myDao = new DVDDaoImpl();
        DVDController controller = new DVDController(myDao, myView);
        controller.run();

    }
}
