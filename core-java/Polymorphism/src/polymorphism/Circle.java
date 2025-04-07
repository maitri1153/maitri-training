package polymorphism;

public class Circle extends Polygon {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void print() {
		System.out.println("This is Circle Class");

	}

	@Override
	public double calculateArea() {
		return (Math.PI * radius * radius);
	}

	protected double getradius() {
		return radius;
	}
}
