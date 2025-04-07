package product;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Purchase {
	Scanner scanner = new Scanner(System.in);

	public void PurchaseProduct(List<Product> products) {
		System.out.println("\n\n\n----------------------------------------");
		System.out.println("What product you want to Purchase : ");
		System.out.println("----------------------------------------");
		String name = scanner.nextLine();

		System.out.println("----------------------------------------");
		System.out.println("Number unit you want to Purchase : ");
		System.out.println("----------------------------------------");
		int unit = scanner.nextInt();
		System.out.println("----------------------------------------");
		System.out.println("Price of the Product : ");
		System.out.println("----------------------------------------");
		Double price = scanner.nextDouble();

		Optional<Product> getname = products.stream().filter(x -> x.getProductname().equalsIgnoreCase(name))
				.findFirst();

		if (getname.isPresent()) {
			Product product2 = getname.get();
			int id = product2.productid;
			int stock = product2.availstock + unit;
			products.set(id,product2);
			//products.add(new Product(id, name, stock, price));
			System.out.println("----------------------------------------");
			System.out.println("Total Bill is : " + unit * price);
			System.out.println("Available Stock : " + stock);
			System.out.println("----------------------------------------");
		} 
		else {
			System.out.println("----------------------------------------");
			System.out.println("New Product Added : ");
			products.add(new Product(9, name, unit, price));
			System.out.println("Product ID :  9");
			System.out.println("Product Name : " + name);
			System.out.println("Product Price : " + price);
			System.out.println("Product Stock is : " + unit);
			System.out.println("----------------------------------------");
		}
	}
}
