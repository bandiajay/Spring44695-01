/**
 * 
 */
package shapes;

/**
 * @author ajay
 *
 */
public class ShapeFactory {
	
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		else if(shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		else{
			return null;
		}
	}
}
