package _03syncApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajaybandi
 */
public class ThreadsWithSyncronized {

    public static void main(String[] args) {
        Printer p = new Printer();

        MyThread myRef = new MyThread(p);
        myRef.start();

        YourThread yourRef = new YourThread(p);
        yourRef.start();
    }
}

class Printer {

    void printDocuments(int noOfCopies, String docName) {
        for (int doc = 1; doc <= noOfCopies; doc++) {
            System.out.println("Printing " + docName + " " + doc);
        }
    }
}

class MyThread extends Thread {

    Printer p;

    public MyThread(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (p) {
            p.printDocuments(12, "Ajay.pdf");
        }
    }

}

class YourThread extends Thread {

    Printer p;

    public YourThread(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (p) {
            p.printDocuments(10, "Bandi.pdf");
        }
    }
}
