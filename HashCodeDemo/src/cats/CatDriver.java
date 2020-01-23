/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats;

/**
 *
 * @author ajaybandi
 */
public class CatDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat c1 = new Cat("puppy", 12);
        Cat c2 = new Cat("puppy", 12);
        Cat c3 = c2;
        
        Cat c4 = new Cat("catty", 12);
        
        System.out.println((c1 == c2));
        System.out.println(c1.equals(c2));
        
        System.out.println("**************************");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println("**************************");
        
        System.out.println(Integer.toHexString(System.identityHashCode(c1)));
        System.out.println(Integer.toHexString(System.identityHashCode(c2)));
        System.out.println(Integer.toHexString(System.identityHashCode(c3)));
        System.out.println(Integer.toHexString(System.identityHashCode(c4)));
        System.out.println("**************************");
        
        String s1 = "Bharath";
        String s2 = "Bharath1";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("**************************");
        
        String str1 = "Ajay";
        String str2 = "Bandi";
        String str3 = "Bobby";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println("**************************");

        
   }
    
}
