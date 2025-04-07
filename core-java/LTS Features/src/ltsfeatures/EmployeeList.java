package ltsfeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeList {
	
	public static void main(String args[]) {
		List<Employe> employeeList = new ArrayList<Employe>();

		employeeList.add(new Employe(111, "Jiya Brein",    32, "Female", "HR",                    2011, 25000.0));
		employeeList.add(new Employe(122, "Paul Niksui",   25, "Male",   "Sales And Marketing",   2015, 13500.0));
		employeeList.add(new Employe(133, "Martin Theron", 29, "Male",   "Infrastructure",        2012, 18000.0));
		employeeList.add(new Employe(144, "Murali Gowda",  28, "Male",   "Product Development",   2014, 32500.0));
		employeeList.add(new Employe(155, "Nima Roy",      27, "Female", "HR",                    2013, 22700.0));
		employeeList.add(new Employe(166, "Iqbal Hussain", 43, "Male",   "Security And Transport",2016, 10500.0));
		employeeList.add(new Employe(177, "Manu Sharma",   35, "Male",   "Account And Finance",   2010, 27000.0));
		employeeList.add(new Employe(188, "Wang Liu",      31, "Male",   "Product Development",   2015, 34500.0));
		employeeList.add(new Employe(199, "Amelia Zoe",    24, "Female", "Sales And Marketing",   2016, 11500.0));
		employeeList.add(new Employe(200, "Jaden Dough",   38, "Male",   "Security And Transport",2015, 11000.5));
		employeeList.add(new Employe(211, "Jasna Kaur",    27, "Female", "Infrastructure",        2014, 15700.0));
		employeeList.add(new Employe(222, "Nitin Joshi",   25, "Male",   "Product Development",   2016, 28200.0));
		employeeList.add(new Employe(233, "Jyothi Reddy",  27, "Female", "Account And Finance",   2013, 21300.0));
		employeeList.add(new Employe(244, "Nicolus Den",   24, "Male",   "Sales And Marketing",   2017, 10700.5));
		employeeList.add(new Employe(255, "Ali Baig",      23, "Male",   "Infrastructure",        2018, 12700.0));
		employeeList.add(new Employe(266, "Sanvi Pandey",  26, "Female", "Product Development",   2015, 28900.0));
		employeeList.add(new Employe(277, "Anuj Chettiar", 31, "Male",   "Product Development",   2012, 35700.0));

		/*
		 * it will count male and female differntly long totalcount =
		 * employeeList.stream().count();
		 * System.out.println("Total Employee : "+totalcount);
		 * 
		 * long femalecount = employeeList.stream().filter(x ->
		 * x.gender=="Female").count();
		 * System.out.println("Total number of Female : "+femalecount);
		 * 
		 * long malecount = employeeList.stream().filter(x -> x.gender=="Male").count();
		 * System.out.println("Total number of Male : "+malecount);
		 */
		System.out.println("Male and Female Employee Count: ");
		Map<String, Long> countemployee = employeeList.stream()
				.collect(Collectors.groupingBy(Employe::getGender, Collectors.counting()));
		System.out.println(countemployee);

		System.out.println("\nPrint all Department name (unique value with distinct())");
		employeeList.stream().map(Employe::getDepartment).distinct().forEach(System.out::println);
		
		System.out.println("\nAverage Age of Male and Female : ");
		Map<String, Double> averageage = employeeList.stream()
				.collect(Collectors.groupingBy(Employe::getGender, Collectors.averagingInt(Employe::getAge)));
		System.out.println(averageage);

		System.out.println("\nHighest paid employee: ");
		Optional<Employe> highestsalary = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employe::getSalary)));
		System.out.println(highestsalary);

		System.out.println("\n Employee who joined after 2015 : ");
		employeeList.stream().filter(x -> x.getYearOfJoining() > 2015).map(Employe::getName)
				.forEach(System.out::println);

		System.out.println("\nEmployee Number in each Department:");
		Map<String, Long> departmentcount = employeeList.stream()
				.collect(Collectors.groupingBy(Employe::getDepartment, Collectors.counting()));
		for (Map.Entry<String, Long> e : departmentcount.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		System.out.println("\nAverage Salary of every department: ");
		Map<String, Double> averagesalary = employeeList.stream()
				.collect(Collectors.groupingBy(Employe::getDepartment, Collectors.averagingDouble(Employe::getSalary)));
		for (Map.Entry<String, Double> entry : averagesalary.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		Optional<Employe> getnameOptional = employeeList.stream()
				.filter(x -> x.getGender() == "Male" && x.getDepartment() == "Product Development")
				.min(Comparator.comparing(Employe::getSalary));
		System.out.println("\nEmployee who works in product dev and male and has a minimum salary");
		Employe employee = getnameOptional.get();
		System.out.println("ID : " + employee.id);
		System.out.println("Name : " + employee.name);
		System.out.println("Age : " + employee.age);
		System.out.println("Gender : " + employee.gender);
		System.out.println("Department : " + employee.department);
		System.out.println("Joining Year : " + employee.yearOfJoining);
		System.out.println("Salary : " + employee.salary);
 
		Optional<Employe> mostworkingexperience = employeeList.stream()
				.sorted(Comparator.comparingInt(Employe::getYearOfJoining)).findFirst();
		Employe employee1 = mostworkingexperience.get();
		System.out.println("\nEmployee With highest experience: ");
		System.out.println("ID : " + employee1.id);
		System.out.println("Name : " + employee1.name);
		System.out.println("Age : " + employee1.age);
		System.out.println("Gender : " + employee1.gender);
		System.out.println("Department : " + employee1.department);
		System.out.println("Joining Year : " + employee1.yearOfJoining);
		System.out.println("Salary : " + employee1.salary);

		System.out.println("\nNumber of male and female in sales:");
		Map<String, Long> salesandgender = employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employe::getGender, Collectors.counting()));
		for (Map.Entry<String, Long> entry : salesandgender.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("\nAverage salary of Male and Female : ");
		Map<String, Double> averagesalary1 = employeeList.stream()
				.collect(Collectors.groupingBy(Employe::getGender, Collectors.averagingDouble(Employe::getSalary)));
		System.out.println(averagesalary1);

		Map<String, List<Employe>> employeeListByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employe::getDepartment));

		Set<Map.Entry<String, List<Employe>>> entrySet = employeeListByDepartment.entrySet();
		for (Map.Entry<String, List<Employe>> entry : entrySet) {
			System.out.println("--------------------------------------");
			System.out.println("Employees In " + entry.getKey() + " : ");
			System.out.println("--------------------------------------");
			List<Employe> list = entry.getValue();
			for (Employe e : list)
				System.out.println(e.getName());
		}
 
		DoubleSummaryStatistics statistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employe::getSalary));
		System.out.println("\n\nAverage salary of all employee : " + statistics.getAverage());
		System.out.println("Total Salary of all Employee : " + statistics.getSum());

		Map<Boolean, List<Employe>> partitionbyage = employeeList.stream()
				.collect(Collectors.partitioningBy(x -> x.getAge() > 25));
		Set<Entry<Boolean, List<Employe>>> entrySet2 = partitionbyage.entrySet();
		for (Entry<Boolean, List<Employe>> entry : entrySet2) {
			System.out.println("----------------------------");
			if (entry.getKey())
				System.out.println("Employees older than 25 years :");
			else
				System.out.println("Employees younger than or equal to 25 years :");

			System.out.println("----------------------------");
			List<Employe> list = entry.getValue();
			for (Employe e : list)
				System.out.println(e.getName());
		}

		System.out.println("\nOldest Employee Details : ");
		Optional<Employe> employeebyage = employeeList.stream().max(Comparator.comparing(Employe::getAge));
		Employe employeebyage1 = employeebyage.get();
		System.out.println("Employee Name       : " + employeebyage1.getName());
		System.out.println("Employee Age        : " + employee1.getAge());
		System.out.println("Employee Department : " + employee1.getDepartment());

	}
}
