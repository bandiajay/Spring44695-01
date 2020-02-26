/**
 * 
 */
package shapes;

/**
 * @author ajay
 *
 */
public class Rectangle implements Shape{
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle() {
		
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double area() {
		return length*breadth;
	}

	@Override
	public double perimeter() {
		return 2*(length + breadth);
	}	

}
