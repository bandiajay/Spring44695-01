/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author AJAY
 */
public class LinkedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        System.out.println(names.add("Kelli"));
        names.add("Bob");
        names.add("Adam");
        System.out.println(names.remove("Bobby"));
        
        System.out.println(names);
        
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("*****************");
        Iterator<String> myItr = names.iterator(); 
        
        while(myItr.hasNext()){
            System.out.println(myItr.next());
        }
        System.out.println("*********************");
        ListIterator<String> myListItr = names.listIterator();
        
        while(myListItr.hasPrevious()){
            System.out.println(myListItr.previous());
        }
        
        System.out.println("*****************");
    }
    
}
