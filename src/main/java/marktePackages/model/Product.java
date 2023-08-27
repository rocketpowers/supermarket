package marktePackages.model;

import lombok.Getter;
import lombok.Setter;
import marktePackages.utils.Utils;

@Getter
@Setter
public class Product {

	private static int count = 1;

	private int id;
	private String name;
	private Double price;

	public Product(String name, Double price) {

		this.id = count;
		this.name = name;
		this.price = price;
		Product.count += 1;

	}

	public String toString() {
		return "Id:" + this.getId() +
				"\nName:" + this.getName() +
				"\nPrice:" + Utils.doubleToString(this.getPrice());

	}
}