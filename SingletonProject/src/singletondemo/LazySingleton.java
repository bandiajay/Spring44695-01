package singletondemo;

public class LazySingleton {

	
	private static LazySingleton single_instance = null;

	public String s;

	private LazySingleton() {
		s = "Hello I am a string part of LazySingleton class";
	}

	public static LazySingleton getInstance() {
		if (single_instance == null)
			single_instance = new LazySingleton();

		return single_instance;
	}
}