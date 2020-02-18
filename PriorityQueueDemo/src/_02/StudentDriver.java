/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02;

import java.util.PriorityQueue;

/**
 *
 * @author ajaybandi
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student(12, "Adam", 3.22);
        Student s2 = new Student(11, "Bob", 3.25);
        Student s3 = new Student(14, "Charlie", 3.33);
        Student s4 = new Student(13, "Dane", 3.54);
        Student s5 = new Student(10, "Ernie", 2.00);

        PriorityQueue<Student> students = new PriorityQueue<>(2);
        //PriorityQueue<Student> students = new PriorityQueue<>(new StudentComparator());

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        while (!students.isEmpty()) {
            System.out.println(students);
            System.out.println(students.poll());
        }
    }

}
