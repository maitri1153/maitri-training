package classandobject;

public class Company {
	public void print() {
		Employee employee = new Employee();
		Client client = new Client();

		employee.setEmployeeName();
		employee.setProjectName();
		client.setClientName();

		System.out.println("Project Name is : " + employee.getProjectName());
		System.out.println("Employee Name is : " + employee.getEmployeeName());
		System.out.println("Client Name is : " + client.getClientName());
	}
}
