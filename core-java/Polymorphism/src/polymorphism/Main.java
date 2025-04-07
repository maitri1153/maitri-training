package polymorphism;

public class Main {
	public static void main(String args[]) {
		Polygon circle = new Circle(7.9);
		Polygon cylinder = new Cylinder(5.0, 8.9);

		drawShapeAndCalculateArea(circle);
		System.out.println(" ");
		drawShapeAndCalculateArea(cylinder);
	}

	public static void drawShapeAndCalculateArea(Polygon shape) {
		shape.print();
		double area = shape.calculateArea();
		System.out.println("Area: " + area);
	}
}
