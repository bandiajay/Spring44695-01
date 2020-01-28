/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees_01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author ajaybandi
 */
public class EmployeeDeptMapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee e1 = new Employee(123, "Bandi", "Ajay", 18);
        Employee e2 = new Employee(187, "Case", "Denise", 34);
        Employee e3 = new Employee(123, "Bell", "Scott", 18);
        Employee e4 = new Employee(876, "Corson", "Mark", 76);
        Employee e5 = new Employee(67, "Mardis", "Lori", 65);

        Department d1 = new Department(44, "CSIS");
        Department d2 = new Department(34, "Geology");
        Department d3 = new Department(55, "Library");

        HashMap<Employee, Department> employeeMap = new HashMap<>();
        
        //TreeMap<Employee, Department> employeeMap = new TreeMap<>();
        employeeMap.put(e1, d1);
        employeeMap.put(e2, d1);
        employeeMap.put(e3, d1);
        employeeMap.put(e4, d2);
        employeeMap.put(e5, d3);
        employeeMap.put(e5, d2);
        
        System.out.println(employeeMap.entrySet());
        System.out.println(employeeMap.size());
        System.out.println(employeeMap);
                
        printMap(employeeMap);
//
//        System.out.println("***************************************");
//        System.out.println("First Entry: " + employeeMap.firstEntry());
//        System.out.println("First Key: " + employeeMap.firstKey());
//        System.out.println("Last Entry: " + employeeMap.lastEntry());
//        System.out.println("Last Key: " + employeeMap.lastKey());
//        System.out.println("***************************************");
//       // System.out.println(employeeMap.pollFirstEntry());
//        //System.out.println(employeeMap.pollLastEntry());
//        System.out.println("***************************************");
//
//        printMap(employeeMap);
//        System.out.println("***************************************");
//        System.out.println("Higher Entry: " + employeeMap.higherEntry(e4));
//        System.out.println("Lower Entry: " + employeeMap.lowerEntry(e4));
//        System.out.println("***************************************");
//
//        System.out.println("Higher Key: " + employeeMap.higherKey(e4));
//        System.out.println("Lower Key: " + employeeMap.lowerKey(e4));
//        System.out.println("***************************************");
//
//        Map<Employee, Department> headMap = employeeMap.headMap(e2);
//        printMap(headMap);
//        System.out.println("***************************************");
//
//        Map<Employee, Department> tailMap = employeeMap.tailMap(e2);
//        printMap(tailMap);
//        System.out.println("***************************************");
//
//        //filtering by salaries (30-70)
//        SortedMap<Employee, Department> tailMap1 = employeeMap.headMap(new Employee(122, "", "", 70)).
//                tailMap(new Employee(234, "", "", 30));
//        printMap(tailMap1);
//        // System.out.println(employeeMap.pollLastEntry());
   }

    public static void printMap(Map<Employee, Department> employeeMap) {
        Iterator<Map.Entry<Employee, Department>> iterator = employeeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
