package classandobject;

class OuterClass {
	int value;

	OuterClass() {
		System.out.println("This is Outerclass");
	}

	class Inner {
		public void display() {
			System.out.println("This is InnerClass");
		}
	}
}

public class InnerClass {

	public static void main(String args[]) {
		OuterClass obj = new OuterClass();
		OuterClass.Inner inner = obj.new Inner();
		inner.display();
	}

}
