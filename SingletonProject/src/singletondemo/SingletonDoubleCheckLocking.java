package singletondemo;

public class SingletonDoubleCheckLocking {

	private static SingletonDoubleCheckLocking instance;
	public String s;

	private SingletonDoubleCheckLocking() {
		s= " I am in singletondoublechecklocking" ;
	}

	public static SingletonDoubleCheckLocking getInstance() {
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (SingletonDoubleCheckLocking.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new SingletonDoubleCheckLocking();
				}
			}
		}
		return instance;
	}
}
