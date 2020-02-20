/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _01;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author ajaybandi
 */
public class PriorityQDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<String> pq = new PriorityQueue<String>(2);
        pq.add("English");
        pq.add("Mandarin");
        pq.add("Telugu");
        pq.offer("Tamil");
        pq.add("Arabic");
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.remove("Telugu");
        System.out.println(pq);
        
        System.out.println("***************");
        Iterator<String> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("***************");

        PriorityQueue<Integer> rank = new PriorityQueue<>();
        rank.add(1);
        rank.add(13);
        rank.add(4);
        rank.add(2);
        rank.add(0);
        System.out.println(rank);

        while (!rank.isEmpty()) {
            System.out.println(rank.poll());
        }
    }
}
