import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19006252, 12 Aug 2020 4:22:32 pm
 */

import java.util.ArrayList;

public class C206_CaseStudy {
<<<<<<< HEAD
	private static String output = "";
=======
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
>>>>>>> branch 'master' of https://github.com/19031979-Chen-Junwei/CaseStudy.git

	public static void main(String[] args) {
<<<<<<< HEAD
		
=======
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
>>>>>>> branch 'master' of https://github.com/19031979-Chen-Junwei/CaseStudy.git

		ArrayList<Transaction> record = new ArrayList<Transaction>();
		
		int option = -1;
		
		
		while (option != 3) {

			menu();
			
			option = Helper.readInt("Enter choice > ");
			
			if (option == 1) {
				addTransaction(record);
			} else if (option == 2) {
				viewTransaction(record);
				System.out.println(output);
				saveTransation();
			}  else if (option == 3) {
				System.out.println("Thank you for using this!");
			} else {
				System.out.println("Invalid option!");
			}

		}
	}

	/**
	 * 
	 */
	public static void saveTransation() {
		String question = Helper.readString("Do you want to save this Transaction? >(y/n) ");
		if(question.equalsIgnoreCase("y")) {
			String nameOfFile = Helper.readString("Name your file> ");
			
			System.out.println("Writing to file...");

			try {
				File file = new File(nameOfFile);
				FileWriter fw = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(output);

				bw.close();
				
				System.out.println("File write successful!");

			} catch (IOException io) {
				System.out.println("There was an error writing to the file.");
			}
		}
	}

	public static String viewTransaction(ArrayList<Transaction> record) {
		
		output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "TRANSACTION ID", "TRANSACTION DATE"
				, "DESCRIPTION", "CUSTOMER", "PRODUCT", "STAFF ID" , "STAFF NAME");
		
		
		for(int i = 0; i < record.size(); i++) {
			String date = record.get(i).getTransDate().toString();
					
			output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", record.get(i).getTransID(), date,
					record.get(i).getDescription(),record.get(i).getCustomer(),record.get(i).getProduct(),
					record.get(i).getStaffID(), record.get(i).getStaffName());
		}
		
		return output;
	}


	private static void addTransaction(ArrayList<Transaction> record) {
		String enterTransID = Helper.readString("Enter Transaction ID > ");
		String enterDate = Helper.readString("Enter date in this format: dd/MM/yyyy > ");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate enterDateLD = LocalDate.parse(enterDate, formatter1);
		String enterDescription = Helper.readString("Enter description> ");
		String enterCustomer = Helper.readString("Enter Customer > ");
		String enterProduct = Helper.readString("Enter Product > ");
		String enterStaffID = Helper.readString("Enter Staff ID > ");
		String enterStaffName = Helper.readString("Enter Staff Name > ");
		
		
		record.add(new Transaction (enterTransID, enterDateLD , enterDescription, enterCustomer
				,enterProduct , enterStaffID,  enterStaffName) );
		
		System.out.println("Transaction added!");
	}
	private static void menu() {
		Helper.line(50, "-");
		System.out.println("WELCOME TO TRANSACTION SYSTEM");
		Helper.line(50, "-");
		System.out.println("1. Add Transaction");
		System.out.println("2. View all Transaction ");
		System.out.println("3. Quit");
	}
	

}
