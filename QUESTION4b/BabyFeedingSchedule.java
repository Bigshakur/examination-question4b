/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.number4;

/**
 *
 * @author Shakur
 */

public class BabyFeedingSchedule {
    public static void main(String[] args) {
        //  here we are defining the constants
        double porridgeVolume = 2.0; 
        double milkVolume = 2.0; 
        double cupVolume = 0.5; 
        int porridgeInterval = 45; 
        int milkInterval = 30; 

        // we can now calculate the total number of cups of porridge and milk
        int totalPorridgeCups = (int) (porridgeVolume / cupVolume);
        int totalMilkCups = (int) (milkVolume / cupVolume);
        
        // we are now finding the total feeding time for porridge
        int totalPorridgeTime = (totalPorridgeCups * porridgeInterval) + (totalPorridgeCups - 1) * porridgeInterval;
        
       
        int totalMilkTime = (totalMilkCups * milkInterval) + (totalMilkCups - 1) * milkInterval;

        
        int totalTime = Math.max(totalPorridgeTime, totalMilkTime);

       
        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        // finaly we can now print the result
        System.out.println("Total time to finish both porridge and milk: " + hours + " hours and " + minutes + " minutes.");
    }
}
