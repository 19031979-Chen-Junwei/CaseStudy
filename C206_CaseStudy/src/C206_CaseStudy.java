
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19006252, 12 Aug 2020 4:22:32 pm
 */

import java.util.ArrayList;

public class C206_CaseStudy {
	public static void menu() {
		System.out.println("Select the options below to perform your tasks: ");
		System.out.println("1. View all product.");
		System.out.println("2. Add new product. ");
		System.out.println("3. Delete product. ");

	}

	public static String viewAllProduct(ArrayList<product> productList) {
		String output="";
		System.out.println(String.format("%-20s %-20s %-20s %-20s", "Product ID", "Category", "Price", "Vendor"));
		for (product i : productList) {
			output+=String.format("%-20d %-20s %-20.2f %-20s", i.getProduct_id(), i.getCategory(),
					i.getPrice(), i.getVendor());
		}
		return output;

	}

	public static void addProduct(ArrayList<product> productList) {
		int id = Helper.readInt("Enter new Product ID: ");
		String category = Helper.readString("Enter new category");
		double price = Helper.readDouble("Enter new price: ");
		String vendor=Helper.readString("Enter new vendor: ");

		
		productList.add(new product(id, category, price,vendor));
		System.out.println("New Product is added!!");
	}

	public static void deleteProduct(ArrayList<product> productList) {
		boolean isFound=false;
		int productId = Helper.readInt("Enter product ID: ");
		String confirm = Helper.readString("Are you sure you want to delete this product? (Y/N): ");

		for (int i = 0; i <productList.size(); i++) {
			if(productList.get(i).getProduct_id() == productId) {
				if (confirm.equalsIgnoreCase("y")) {
					isFound=true;
				}

			} else {
				System.out.println("Invalid Product ID");
			}
			if(isFound==true) {
				productList.remove(productList.get(i));
				System.out.println("Successfully removed!");
			}
		}
	}
//=======================================================================================================================
	public static product inputproduct() {
		int id = Helper.readInt("Enter new Product ID: ");
		String category = Helper.readString("Enter new category");
		double price = Helper.readDouble("Enter new price: ");
		String vendor=Helper.readString("Enter new vendor: ");

		product item= new product(id, category, price,vendor);
		return item;
	}

	public static void addProduct(ArrayList<product> productList,product item) {
		

		productList.add(item);
		System.out.println("New Product is added!!");
	}

	public static void main(String[] args) {
		ArrayList<product> productList = new ArrayList<product>();
		menu();
		int option = 0;
		while (option != 4) {
			System.out.println("");
			option = Helper.readInt("Enter your option: ");

			if (option == 1) {
				viewAllProduct(productList);
				System.out.println("");
			} else if (option == 2) {
				addProduct(productList);
				System.out.println("");
			} else if (option == 3) {
				deleteProduct(productList);
				System.out.println("");
			} else {
				System.out.println("Exit!");
			}

		}

	}

}
