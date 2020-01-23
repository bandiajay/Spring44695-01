/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashSetDemo;


import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ajay
 */
public class BuildingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Building b1 = new Building("Colden", 121);
        Building b2 = new Building("VLK", 234);
        Building b3 = new Building("Wells", 236);
        Building b4 = new Building("Union", 234);
        Building b5 = new Building("Colden", 121);
        
        Set<Building> buildSet = new HashSet<>();
        buildSet.add(b1);
        buildSet.add(b2);
        buildSet.add(b3);
        buildSet.add(b4);
        buildSet.add(b5);
        
        System.out.println("Build set has "+buildSet.size()+" elements.");
        System.out.println(buildSet);
    }
    
}
