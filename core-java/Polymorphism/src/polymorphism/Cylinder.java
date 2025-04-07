package polymorphism;

public class Cylinder extends Circle {

	private double height;

	Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	@Override
	public void print() {
		System.out.println("This is Cylinder class");

	}

	@Override
	public double calculateArea() {
		double circleArea = super.calculateArea();
		double sideArea = 2 * Math.PI * getradius() * height;
		return 2 * circleArea + sideArea;
	}

}
