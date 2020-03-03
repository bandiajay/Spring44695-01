package abstractfactorydemo;
import java.util.Scanner;

public class AbstractFactoryDriver {

	public static void main(String[] args) {
		FactoryProducer factoryProducer = new FactoryProducer();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the company either Audi or Mercedes:");
		String company = input.nextLine();
		AbstractFactory abstractFactory = factoryProducer.getFactory(company);
		if (abstractFactory instanceof MercedesFactory) {
			Tire t = abstractFactory.createTire();

			System.out.println(t.getTireModel());
			HeadLight h = abstractFactory.createHeadLight();
			System.out.println(h.getHeadLightModel());

		} else if (abstractFactory instanceof AudiFactory) {
			HeadLight h = abstractFactory.createHeadLight();
			System.out.println(h.getHeadLightModel());
			Tire t = abstractFactory.createTire();
			System.out.println(t.getTireModel());
		}

	}
}
