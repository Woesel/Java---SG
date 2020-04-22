
package com.tenzin.exercise8;

/**
 *
 * @author Tenzin Woesel
 * Apr 21, 2020
 */
public class ReturnToSender {
    
    public static void main(String[] args) {
        
        double aSurprise = surprise();
        int aSecret = secret();
        char aMystery = mystery();
        boolean itsClassified = classified();
        String totallyUnexpected = unexpected();
        
        System.out.println("Mysterious: " + aMystery);
        System.out.println("Secret : = " + aSecret);
        System.out.println("Surprising:" + aSurprise );
        System.out.println("Classified: " + itsClassified);
        System.out.println("Unexpected: " + totallyUnexpected);
        
        
    }
    
    public static int secret(){
        
        return 42;
    }
    
    public static double surprise(){
        
        return 3.14;
    }
    
    public static char mystery(){
        
        return 'X';
    }
    
    public static boolean classified(){
        
        return true;
    }
    
    public static String unexpected(){
        
        return "Spanish Inquisition";
    }

}
