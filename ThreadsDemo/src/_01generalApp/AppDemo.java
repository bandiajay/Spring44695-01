package _01generalApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajaybandi
 */
public class AppDemo {
    
    public static void main(String[] args) {
        MyTask task = new MyTask();
        task.print1();
        task.print2();      
    }
}

class MyTask{
    
    void print1(){
        System.out.println("Start printer 1");
        for(int doc=1; doc<=10; doc++){
            System.out.println("Printing document# "+doc +" from Printer1");
        }
         System.out.println("End printer 1");
        System.out.println("======================");
    }
    
    void print2(){
        System.out.println("Start printer 2");
        for(int doc=1; doc<=10; doc++){
            System.out.println("Printing document# "+doc +" from Printer2");
        }
         System.out.println("End printer 2");
         System.out.println("======================");
    }
}