package ltsfeatures;

record Employee(int id, String firstName,String lastName) {}

public class Records {
	public static void main(String args[]) {
		Employee e1 = new Employee(1001, "Derok", "Dranf");
	    System.out.println(e1.id() + " " + e1.firstName()+ " " + e1.lastName());
	    System.out.println(e1);
	}
}
