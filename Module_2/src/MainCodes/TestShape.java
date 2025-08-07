package MainCodes;
import shapes.Circle;
import shapes.Rectangle;

public class TestShape {
	public static void main (String[] args) {
		Circle cir = new Circle(7.5);
		Rectangle rect = new Rectangle(5.5, 6.5);
		
		System.out.println("Circle's Area is : " + cir.area() + " Perimeter is : " + cir.perimeter());
		System.out.println("Rectangle's Area is : " + rect.area() + " Perimeter is : " + rect.perimeter());
	}
}
