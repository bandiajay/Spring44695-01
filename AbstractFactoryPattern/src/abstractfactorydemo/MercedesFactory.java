package abstractfactorydemo;

public class MercedesFactory implements AbstractFactory {

	@Override
	public Tire createTire() {
		return new MercedesTire();
	}

	@Override
	public HeadLight createHeadLight() {
		return new MercedesHeadLight();
	}

}
