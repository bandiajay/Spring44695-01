/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees_01;

import java.util.Comparator;

/**
 *
 * @author ajaybandi
 */
public class EmployeeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary() > o2.getSalary()){
            return +1;
        }
        
        else if(o1.getSalary() == o2.getSalary()){
            return 0;
        }
        
        else{
            return -1;
        }
    }
    
}
