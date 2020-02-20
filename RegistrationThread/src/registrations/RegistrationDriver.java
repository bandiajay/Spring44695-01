/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrations;

/**
 *
 * @author ajaybandi
 */
public class RegistrationDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registration fa19 = new Registration("fall2019", 20);
        Registration fa20 = new Registration("fall2020", 20);
        
        Thread t1 = new Thread(fa19);
    
        Thread t2 = new Thread(fa20);
      
        t1.start();
        t2.start();      
        
    }
    
}
