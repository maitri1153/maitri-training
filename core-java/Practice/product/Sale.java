package product;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Sale {

	public void sellProduct(List<Product> products) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("What product you want to sale : ");
		System.out.println("----------------------------------------");
		System.out.println("1. Pen");
		System.out.println("2. Pencil");
		System.out.println("3. Project Paper");
		System.out.println("4. Shapner");
		System.out.println("5. Colour Pen");
		System.out.println("6. Marker Pen");
		System.out.println("7. Plastic Colour");
		System.out.println("8. Diary");
		System.out.println("----------------------------------------");
		int product = scanner.nextInt();
		System.out.println("----------------------------------------");

		System.out.println("Number unit you want to Sale : ");
		System.out.println("----------------------------------------");
		int unit = scanner.nextInt();

		Optional<Product> getstock = products.stream()
				.filter(x -> x.getProductid() == product && x.getAvailstock() > unit).findFirst();
		
		if (getstock.isPresent()) {
			Product product2 = getstock.get();
			int id = product2.productid;
			String name = product2.productname;
			int stock = product2.availstock - unit;
			Double price = product2.price;
			products.add(new Product(id, name, stock, price));
			System.out.println("----------------------------------------");
			System.out.println("Total Bill is : " + unit * price);
			System.out.println("Available Stock : " + stock);
			System.out.println("----------------------------------------");
			product2.availstock = stock;
		} else {
			System.out.println("----------------------------------------");
			System.out.println("Stock is not available :");
			System.out.println("----------------------------------------");
		}

	}
}
