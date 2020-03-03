package singletondemo;

public class EagerSingleton {

	private static EagerSingleton single_instance = new EagerSingleton();

	public String s;

	private EagerSingleton() {
		s = "Hello I am a string part of EagerSingleton class";
	}

	public static EagerSingleton getInstance() {
		return single_instance;
	}
}
