import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class C206_CaseStudy {
	private static String output = "";

	public static void main(String[] args) {
		

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
