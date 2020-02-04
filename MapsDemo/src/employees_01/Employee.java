/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees_01;

import java.util.Objects;

/**
 *
 * @author ajaybandi
 */
public class Employee implements Comparable<Employee>{
    private int empID;
    private String lastName;
    private String firstName;
    private double salary;

    public Employee(int empID, String lastName, String firstName, double salary) {
        this.empID = empID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empID + " " + firstName +" "+lastName +" "+ salary;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.empID;
        hash = 83 * hash + Objects.hashCode(this.lastName);
        hash = 83 * hash + Objects.hashCode(this.firstName);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.empID != other.empID) {
            return false;
        }
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Employee o) {
        //return this.lastName.compareTo(o.getLastName());
       return Double.compare(this.getSalary(), o.getSalary());
    }
}
