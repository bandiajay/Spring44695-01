package singletondemo;

public class SingletonDriver {

    public static void main(String[] args) {

        // Eager instantiation 
        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();

        System.out.println("es1 s value: " + es1.s);
        System.out.println("es2 s value: " + es2.s);
        System.out.print("\n");

        //changing es1
        es1.s = "Welcome to Eager Singleton";
        System.out.println("es1 s value: " + es1.s);
        System.out.println("es2 s value: " + es2.s);
        System.out.print("\n");

        //changing es2
        es2.s = "changed text to eagerSingleton2";
        System.out.println("ES1 s value: " + es1.s);
        System.out.println("ES2 s value: " + es2.s);

        System.out.println("************************************************");

        // Lazy instantiation 
        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();

        System.out.println("ls1 s value: " + ls1.s);
        System.out.println("ls2 s value:  " + ls2.s);
        System.out.print("\n");

        ls1.s = (ls1.s).toUpperCase();
        System.out.println("ls1 s value: " + ls1.s);
        System.out.println("ls2 s value:  " + ls2.s);
        System.out.print("\n");

        ls2.s = (ls2.s).toLowerCase();
        System.out.println("ls1 s value: " + ls1.s);
        System.out.println("ls2 s value:  " + ls2.s);

        System.out.println("************************************************");

        // SingletonDoubleCheckLocking instantiation 
        SingletonDoubleCheckLocking sdcl1 = SingletonDoubleCheckLocking.getInstance();
        SingletonDoubleCheckLocking sdcl2 = SingletonDoubleCheckLocking.getInstance();
        
        System.out.println("String from sdcl1 is: " + sdcl1.s);
        System.out.println("String from sdcl2 is: " + sdcl2.s);
        System.out.print("\n");
        
        sdcl1.s = sdcl1.s.toUpperCase();
        System.out.println("String from sdcl1 is: " + sdcl1.s);
        System.out.println("String from sdcl2 is: " + sdcl2.s);
        System.out.print("\n");

        sdcl2.s = (sdcl2.s).toLowerCase();
        System.out.println("String from sdcl1 is: " + sdcl1.s);
        System.out.println("String from sdcl2 is: " + sdcl2.s);
        System.out.println("************************************************");                
        
        //Using enum1 enum
        SingletonEnum enum1 = SingletonEnum.INSTANCE;
        SingletonEnum enum2 = SingletonEnum.INSTANCE;

        System.out.println("Enum "+enum1.getValue());
        System.out.println("Enum "+enum2.getValue());
        
        enum1.setValue(2);
        System.out.println("Enum "+enum1.getValue());
        System.out.println("Enum "+enum2.getValue());
        
        enum2.setValue(-4);
        System.out.println("Enum "+enum1.getValue());
        System.out.println("Enum "+enum2.getValue());

    }

}
