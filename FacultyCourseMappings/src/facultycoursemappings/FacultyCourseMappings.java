/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultycoursemappings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author ajaybandi
 */
public class FacultyCourseMappings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> bandiCourses = new ArrayList<>();
        bandiCourses.add("Frameworks");
        bandiCourses.add("Frameworks");
        bandiCourses.add("C#.NET");
      
        List<String> caseCourses = new ArrayList<>();
        caseCourses.add("Web Apps");
        caseCourses.add("Web Apps");
        caseCourses.add("Big Data");
        caseCourses.add("Forensics");

        List<String> hootCourses = new ArrayList<>();
        hootCourses.add("Discreete Math");
        hootCourses.add("Andriod");
        hootCourses.add("Andriod");
        hootCourses.add("ML");

        List<String> bellCourses = new ArrayList<>();
        bellCourses.add("Java");
        bellCourses.add("Secure Programming");
        bellCourses.add("ML");
        bellCourses.add("Frameworks");

        Map<String, List<String>> courseMap = new TreeMap<>();
        courseMap.put("Bandi", bandiCourses);
        courseMap.put("Case", caseCourses);
        courseMap.put("Hoot", hootCourses);
        courseMap.put("Bell", bellCourses);
        
        uniqueCourses(courseMap);
        System.out.println("************");
        int count = who_HowManyTeaches(courseMap, "ML");
        System.out.println(count+" faculty member(s) teaches ML course.");
        System.out.println("************");
        
   }

    private static void uniqueCourses(Map<String, List<String>> courseMap) {
        Set<String> keySet = courseMap.keySet();
        for(String faculty : keySet){
            List<String> courses = courseMap.get(faculty);
            HashSet<String> uniqueCourses = new HashSet<>();
            for(String s: courses){
                uniqueCourses.add(s);            
            }
            System.out.println(faculty+" has "+uniqueCourses.size()+" unique course preparations.");
        }
    }

    private static int who_HowManyTeaches(Map<String, List<String>> courseMap, String course) {      
        int count =0;
        Iterator<Map.Entry<String, List<String>>> iterator = courseMap.entrySet().iterator();        
        while(iterator.hasNext()){
            Map.Entry<String, List<String>> entry = iterator.next();            
            if(entry.getValue().contains(course)){
                System.out.println(entry.getKey()+" teaches "+course+"."); 
                count++;
            }
        } 
        return count;
    }   
}
    
        

    

    

