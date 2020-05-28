
package com.tenzin.practice;

/**
 *
 * @author Tenzin Woesel
 * May 5, 2020
 */
public class MidSizeSedan implements Vehicle{

    //this is an annotation: a form of metadata that help describe the program but are not part of the program itself. 
    
    @Override 
    public void moveForward() {
        System.out.println("Move forward");
        
    }

    @Override
    public void moveBackward() {
        System.out.println("Move backward");
    }

    @Override
    public void stop() {
        System.out.println("Stop.!");
        
    }
    

}
