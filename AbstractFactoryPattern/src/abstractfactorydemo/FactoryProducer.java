package abstractfactorydemo;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryname) {
		if(factoryname.equalsIgnoreCase("audi"))
			return new AudiFactory();
		else if(factoryname.equalsIgnoreCase("mercedes"))
				return new MercedesFactory();
		else return null;
	}
}
