package abstractfactorydemo;


public class AudiFactory implements AbstractFactory {

	@Override
	public Tire createTire() {
		return new AudiTire();
	}

	@Override
	public HeadLight createHeadLight() {
		return new AudiHeadLight();
	}

}
