/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrations;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author ajaybandi
 */
public class Registration implements Runnable {

    private static int totalSeats = 25;
    private String batchName;
    private int numStudents;
    private int numberSeatesRegistered;

    private static ReentrantLock regisLock = new ReentrantLock();

    public Registration(String batchName, int numStudents) {
        this.batchName = batchName;
        this.numStudents = numStudents;
        this.numberSeatesRegistered = 0;
    }

    @Override
    public void run() {
        for (int i = 1; i <= numStudents; i++) {
            regisLock.lock();
            try {
                if (totalSeats <= 0) {
                    throw new SeatUnavailableException("Zero seats!");
                }
                Date now = new Date();
                totalSeats--;
                numberSeatesRegistered++;
                System.out.println("Seat registered for student# " + i + " of " + batchName + " at " + now);
            } catch (SeatUnavailableException e) {
                System.out.println(e.getMessage());
            } finally {
                regisLock.unlock();
            }
        }
        System.out.println("Total # of students from " + batchName + "registered: " + numberSeatesRegistered);
    }//end run
}//end class

