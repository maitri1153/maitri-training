package product;

public class Product {
	int productid;
	String productname;
	int availstock;
	double price;

	public Product(int productid, String productname, int availstock, double price) {
		this.productid = productid;
		this.productname = productname;
		this.availstock = availstock;
		this.price = price;
	}

	public int getProductid() {
		return productid;
	}

	public String getProductname() {
		return productname;
	}

	public int getAvailstock() {
		return availstock;
	}

	public double getPrice() {
		return price;
	}
}
