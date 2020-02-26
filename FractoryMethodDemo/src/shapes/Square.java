package shapes;
/**
 * @author ajay
 *
 */
public class Square implements Shape {
	
	private double side;

	public Square(double side) {
		this.side = side;
	}

	public Square() {
		super();
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double area() {		
		return side*side;
	}

	@Override
	public double perimeter() {
		return 4*side;
	}

}
