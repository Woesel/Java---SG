package com.tenzin.classroster;

import com.tenzin.classroster.controller.ClassRosterController;
import com.tenzin.classroster.dao.ClassRosterAuditDao;
import com.tenzin.classroster.dao.ClassRosterAuditDaoFileImpl;
import com.tenzin.classroster.dao.ClassRosterDao;
import com.tenzin.classroster.dao.ClassRosterDaoFileImpl;
import com.tenzin.classroster.service.ClassRosterServiceLayer;
import com.tenzin.classroster.service.ClassRosterServiceLayerImpl;
import com.tenzin.classroster.ui.ClassRosterView;
import com.tenzin.classroster.ui.UserIO;
import com.tenzin.classroster.ui.UserIOConsoleImpl;

/**
 *
 * @author Tenzin Woesel May 10, 2020
 */
public class App {

    public static void main(String[] args) {

        //Instantiate the UserIO implementation
        UserIO myIo = new UserIOConsoleImpl();
        //Instantiate the View and wire the UserIO implementation into it
        ClassRosterView myView = new ClassRosterView(myIo);
        //Instantiate the DAO
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        //Instantiate the Audit Dao
        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
        //Instantiate the Service Layer and wire the DAO and Audit DAO into it
        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        //Instantiate the Controller and wire the Service Layer into it
        ClassRosterController controller = new ClassRosterController(myService, myView);
        //Kick off the controller
        controller.run();
    }

}
