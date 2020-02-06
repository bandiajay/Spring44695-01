/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02;

import java.util.Comparator;

/**
 *
 * @author ajaybandi
 */
public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGpa() < o2.getGpa()){
            return 1;
        }
        else if(o1.getGpa() == o2.getGpa()){
            return 0;
        }
        else{
            return -1;
        }
    }
    
}
