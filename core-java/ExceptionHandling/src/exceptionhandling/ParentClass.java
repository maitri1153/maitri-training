package exceptionhandling;

public class ParentClass {
	public static void main(String args[]) {
		ParentClass parentclass = new ParentClass();
		parentclass.sum();
	}

	public void sum() {
		try {
			ChildClass1 childclass = new ChildClass1();
			int result = childclass.result();
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
