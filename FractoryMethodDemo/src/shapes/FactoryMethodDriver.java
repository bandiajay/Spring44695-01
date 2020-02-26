package shapes;

import java.io.IOException;
import java.util.Scanner;

public class FactoryMethodDriver {

	public static void main(String[] args) throws IOException {
		try (Scanner scan = new Scanner(System.in)) {
			ShapeFactory factory = new ShapeFactory();
			System.out.println("Enter the shape: ");
			String shape = scan.next();
			Shape enteredShape = factory.getShape(shape);

			if (enteredShape instanceof Square) {
				Square s = (Square) enteredShape;
				System.out.println("Enter the value of side of the square: ");
				double side = scan.nextDouble();
				s.setSide(side); 
				System.out.println("Area: " + s.area());
				System.out.println("Perimeter: " + s.perimeter());
			}
			else if(enteredShape instanceof Rectangle) {
				Rectangle r = (Rectangle) enteredShape;
				System.out.println("Enter length of the rectangle: ");
				r.setLength(scan.nextDouble());
				System.out.println("Enter breadth of the rectangle: ");
				r.setBreadth(scan.nextDouble());
				System.out.println("Area: " + r.area());
				System.out.println("Perimeter: " + r.perimeter());				
			}
			else if(enteredShape instanceof Circle) {
				Circle c = (Circle) enteredShape;
				System.out.println("Enter the radius of circle: ");
				c.setRadius(scan.nextDouble());
				System.out.println("Area: " + c.area());
				System.out.println("Perimeter: " + c.perimeter());					
			}
			else {
				System.out.println("Not a correct shape!");
			}
		}
	}
}
