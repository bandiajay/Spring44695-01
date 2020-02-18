/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _02;

/**
 *
 * @author ajaybandi
 */
public class Student implements Comparable<Student>{
    private int ID;
    private String name;
    private double gpa;

    public Student(int ID, String name, double gpa) {
        this.ID = ID;
        this.name = name;
        this.gpa = gpa;
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return  ID + "-" + name + "-" + gpa;
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 97 * hash + this.ID;
//        return hash;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Student other = (Student) obj;
//        if (this.ID != other.ID) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public int compareTo(Student o) {
        if(this.getID() > o.getID())
            return 1;
        else if(this.getID() == o.getID())
            return 0;
        else
            return -1;
    }

}
