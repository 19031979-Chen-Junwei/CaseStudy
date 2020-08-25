import java.util.ArrayList;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class C206_CaseStudy {

<<<<<<< HEAD
		public static void menu() {
			System.out.println("Select the different options");
			System.out.println("1. View all outlet");
			System.out.println("2. Add new outlet");
			System.out.println("3. Delete outlet");
			System.out.println("4. Update no of staff");
			System.out.println("5. Exit");
			
		}
		
		public static void viewAllOutlet(ArrayList<outlet>outletList) {
			System.out.println(String.format("%-20s %-20s %-20s %-20s","Outlet ID" , "Outlet name" , "Outlet location" , "No of Staff" ));
			for(outlet i : outletList) {
				System.out.println(String.format("%-20d %-20s %-20s %-20d", i.getOutletID() , i.getName() , i.getLocation() , i.getNoOfStaff()));
			}
		}
		
		public static void addOutlet(ArrayList<outlet>outletList) {
			int outletId = Helper.readInt("Enter Outlet ID >");
			String outletName = Helper.readString("Enter Outlet name >");
			String outletLocation = Helper.readString("Enter Outlet location >");
			int outletNoOfStaff = Helper.readInt("Enter Outlet no of staff >");
			
			outletList.add(new outlet(outletId , outletName , outletLocation , outletNoOfStaff));
			System.out.println("New outlet is added! ");
		}
		
		public static void deleteOutlet(ArrayList<outlet>outletList) {
			boolean isFound = false;
			int outletId = Helper.readInt("Enter product ID: ");
			String confirm = Helper.readString("Are you sure you would want to delete this outlet ID ? ");
			
			for(outlet i : outletList) {
				if(i.getOutletID() == outletId) {
					if(confirm.equalsIgnoreCase("y")) {
						outletList.remove(i);
						System.out.println("Outlet is successfully removed!");
					}
				}else {
					System.out.println("Invalid outlet id !");
				}
				
			}
			
		}
		
		public static void updateStaff(ArrayList<outlet>outletList) {
			int id = Helper.readInt("Enter Outlet ID: ");
			int Index = -1;
			int numTimesReturn = 0;
			int num = 0;
			int option = 0;
			boolean isFound = false;
			
			for (int i=0; i<outletList.size();i++) {
				if(id == outletList.get(i).getOutletID()) {
					isFound = true;
					Index = i;
				}
			}
			if(isFound == true) {
				int NoOfStaff = Helper.readInt("What is the update number of staff > ");
				outletList.get(Index).setNoOfStaff(NoOfStaff);
				System.out.println(NoOfStaff + "Updated");
			
			}else {
				System.out.println("Invalid outlet id!");
			}
			
			
		}
		public static void main(String[] args) {
			ArrayList<outlet>outletList = new ArrayList<outlet>();
			
			int option = 0;
			while(option !=5) {
				System.out.println("");
				menu();
				option = Helper.readInt("Enter your option > ");
			
			if(option ==1) {
				viewAllOutlet(outletList);
				System.out.println("");
			}
			else if(option ==2) {
				addOutlet(outletList);
				System.out.println("");
			}
			else if(option ==3) {
				deleteOutlet(outletList);
				System.out.println("");
			}
			else if(option==5){
				System.out.println("Exit");
			}
			else if(option ==4) {
				updateStaff(outletList);
				System.out.println(" ");
			}
			else {
				System.out.println("Invalid input!");
			}
			}
			
			
		}
		
		
=======

	private static ArrayList<product> productList = new ArrayList<product>();
	private static ArrayList<Transaction> record = new ArrayList<Transaction>();

	public static void main(String[] args) {

		int option = -1;

		while (option != 4) {

			transaction_menu();

			option = Helper.readInt("Enter choice > ");

			if (option == 1) {
				addTransaction(record);
			} else if (option == 2) {
				viewTransaction(record);

			} else if (option == 3) {
				updateTransaction(record);
			} else if (option == 4) {
				System.out.println("Thank you for using this!");
			} else {
				System.out.println("Invalid option!");
			}

		}
>>>>>>> branch 'master' of https://github.com/19031979-Chen-Junwei/CaseStudy.git

	}

<<<<<<< HEAD
		
	


=======
	public static void transaction_menu() {
		Helper.line(50, "-");
		System.out.println("WELCOME TO TRANSACTION SYSTEM");
		Helper.line(50, "-");
		System.out.println("1. Add Transaction");
		System.out.println("2. View all Transaction ");
		System.out.println("3. Update Transaction ");
		System.out.println("4. Quit");
	}

	// update transaction
	public static void updateTransaction(ArrayList<Transaction> record) {
		int index = -1;
		boolean isFound = false;
		String transid = Helper.readString("Enter Transaction ID that you want to update: ");

		for (int i = 0; i < record.size(); i++) {
			if (record.get(i).getTransID().equalsIgnoreCase(transid)) {
				index = i;
				isFound = true;

			}
		}
		if (isFound == true) {
			System.out.println("1. Transaction ID: ");
			System.out.println("2. Transaction Date: ");
			System.out.println("3. Description: ");
			System.out.println("4. Customer Name: ");
			System.out.println("5. Product ID: ");
			System.out.println("6. Product Name:");
			System.out.println("7. Staff ID: ");
			System.out.println("8. Staff Name: ");
			System.out.println("9. Condition: ");

			int option = Helper.readInt("Enter your option> ");
			if (option == 1) {
				String newID = Helper.readString("Enter new Transaction ID> ");
				record.get(index).setTransID(newID);
			} else if (option == 2) {
				String newDate = Helper.readString("Enter new Date (dd/MM/yyyy)> ");
				DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate enterDateLD = LocalDate.parse(newDate, formatter1);

				record.get(index).setTransDate(enterDateLD);
			} else if (option == 3) {
				String newDescription = Helper.readString("Enter new Description> ");
				record.get(index).setDescription(newDescription);

			} else if (option == 4) {
				String newCustomerName = Helper.readString("Enter new Customer> ");
				record.get(index).setCustomer(newCustomerName);

			} else if (option == 5) {
				int newProduct = Helper.readInt("Enter new Product ID: ");
				record.get(index).getProduct_item().setProduct_id(newProduct);
			} else if (option == 6) {
				String newProduct = Helper.readString("Enter new Product Name: ");
				record.get(index).getProduct_item().setProduct_name(newProduct);

			} else if (option == 7) {
				String newStaffID = Helper.readString("Enter new Staff ID ");
				record.get(index).setStaffID(newStaffID);

			} else if (option == 8) {
				String newStaffName = Helper.readString("Enter new Staff Name ");
				record.get(index).setStaffName(newStaffName);

			} else if (option == 9) {
				String newCondition = Helper.readString("Enter new Condition: ");
				record.get(index).getProduct_item().setCondition(newCondition);
			} else {
				System.out.println("Invaild Option!");
			}
		}
	}

	// view all transaction record, including transaction id, transaction date,
	// description, customer name, product id, product name, staff id, staff name,
	// condition
	public static void viewTransaction(ArrayList<Transaction> record) {

		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "TRANSACTION ID",
				"TRANSACTION DATE", "DESCRIPTION", "CUSTOMER", "PRODUCT ID", "PRODUCT NAME", "STAFF ID", "STAFF NAME",
				"CONDITION");

		for (int i = 0; i < record.size(); i++) {
			String date = record.get(i).getTransDate().toString();

			output += String.format("%-20s %-20s %-20s %-20s %-20d %-20s %-20s %-20s %-20s\n",
					record.get(i).getTransID(), date, record.get(i).getDescription(), record.get(i).getCustomer(),
					record.get(i).getProduct_item().getProduct_id(), record.get(i).getProduct_item().getProduct_name(),
					record.get(i).getStaffID(), record.get(i).getStaffName(),
					record.get(i).getProduct_item().getCondition());
		}
		System.out.println(output);

		saveTransation(output);

	}

	// save transaction record to file
	private static void saveTransation(String output) {
		String question = Helper.readString("Do you want to save this Transaction? >(y/n) ");
		if (question.equalsIgnoreCase("y")) {
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

	// input transaction
	public static Transaction inputTransaction() {
		String enterTransID = Helper.readString("Enter Transaction ID > ");
		String enterDate = Helper.readString("Enter date in this format: dd/MM/yyyy > ");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate enterDateLD = LocalDate.parse(enterDate, formatter1);
		String enterDescription = Helper.readString("Enter description> ");
		String enterCustomer = Helper.readString("Enter Customer > ");
		int enterProductID = Helper.readInt("Enter Product ID> ");
		String enterProductName = Helper.readString("Enter Product > ");
		String enterStaffID = Helper.readString("Enter Staff ID > ");
		String enterStaffName = Helper.readString("Enter Staff Name > ");
		String setCondiction = Helper.readString("Enter Condiction> ");

		for (int i = 0; i < productList.size(); i++) {
			if (enterProductID == productList.get(i).getProduct_item().getProduct_id()) {
				productList.get(i).getProduct_item().setCondition(setCondiction);;
			}
		}

		Transaction t1 = new Transaction(enterTransID, enterDateLD, enterDescription, enterCustomer, enterProductID,
				enterProductName, enterStaffID, enterStaffName, setCondiction);
		return t1;

	}

	public static void addTransaction(ArrayList<Transaction> record, Transaction t1) {
		record.add(t1);
	}

	// Junit
	private static void addTransaction(ArrayList<Transaction> record) {
		Transaction t1 = inputTransaction();
		C206_CaseStudy.addTransaction(record, t1);
	}
	
}
>>>>>>> branch 'master' of https://github.com/19031979-Chen-Junwei/CaseStudy.git
