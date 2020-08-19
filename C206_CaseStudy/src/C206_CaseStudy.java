import java.util.ArrayList;

public class C206_CaseStudy {

		public static void menu() {
			System.out.println("Select the different options");
			System.out.println("1. View all outlet");
			System.out.println("2. Add new outlet");
			System.out.println("3. Delete outlet");
			System.out.println("4. Exit");
			
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
				System.out.println(outletList);
				System.out.println("");
			}
			else if(option==4){
				System.out.println("Exit");
			}
			else {
				System.out.println("Invalid input!");
			}
			}
			
			
		}
		
		

	}

		
	


