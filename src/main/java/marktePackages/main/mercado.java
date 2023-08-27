package marktePackages.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import marktePackages.model.Product;

public class mercado {

	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Product> products;
	private static Map<Product, Integer> carrinho;

	public static void main(String[] args) {
		products = new ArrayList<>();
		carrinho = new HashMap<>();
		menu();
	}

	private static void menu() {
		System.out.println();
		System.out.println("-----supermercado são vicente-----");
		System.out.println();
		System.out.println("select a operation for start");
		System.out.println("|  option 1 - register  |");
		System.out.println("|  option 2 - listing  |");
		System.out.println("|  option 3 - buy  |");
		System.out.println("|  option 4 - cart  |");
		System.out.println("|  option 5 - exit  |");

		int option = scan.nextInt();

		switch (option) {
		case 1:

			registerProduct();
			break;

		case 2:
			listproduct();
			break;

		case 3:
			buyProduct();
			break;

		case 4:
			checkKart();
			break;

		case 5:
			System.out.println(" bye, see you soon :)");
			System.exit();

		default:
			System.out.println("invalid option");
			menu();
			break;

		}
	}

	private static void registerProduct() {
		System.out.println("product name ");
		String name = scan.next();

		System.out.println("price of the product");
		Double price = scan.nextDouble();

		Product product = new Product(name, price);
		products.add(product);

		System.out.println(product.getName() + "register sucessfull");
		menu();

	}

}
