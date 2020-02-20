package _02threadApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajaybandi
 */
public class AppDemoUsingThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AnotherTask task = new AnotherTask();
        task.start();//internally execute run method.
        
        
        Runnable r = new SomeTask();
        Thread t = new Thread(r);
        t.start();
        
        System.out.println("Start printer 2");
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("Printing document# " + doc + " from Printer2");
        }
        System.out.println("End printer 2");
        System.out.println("======================");

    }

}

class AnotherTask extends Thread {

    @Override
    public void run() {
        System.out.println("Start printer 1");
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("Printing document# " + doc + " from Printer1");
        }
        System.out.println("End printer 1");
        System.out.println("======================+");
    }
}

class SomeTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Start printer 3");
        for (int doc = 1; doc <= 10; doc++) {
            System.out.println("Printing document# " + doc + " from Printer3");
        }
        System.out.println("End printer 3");
        System.out.println("======================");
        }
}
