/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author AJAY
 */
public class QueueDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> myQ = new LinkedList<>();
        
        ArrayBlockingQueue<Integer> aq = new ArrayBlockingQueue<>(3);
        aq.add(12);
        aq.add(34);
        aq.add(65);
        aq.remove();
        System.out.println(aq.offer(67));
        System.out.println(aq);
        
    }
    
}
