import java.time.LocalDate;

public class Transaction {
	private String transID;
	private LocalDate transDate;
	private String description;
	private String customer;
	private product_item product_item;
	private String staffID;
	private String staffName;

	public Transaction(String transID, LocalDate transDate, String description, String customer, int product_id,
			String product_name, String staffID, String staffName,String condition) {

		product_item = new product_item(product_id, product_name,condition);
		this.transID = transID;
		this.transDate = transDate;
		this.description = description;
		this.customer = customer;
		this.staffID = staffID;
		this.staffName = staffName;
	}
	

	public product_item getProduct_item() {
		return product_item;
	}

	public void setProduct_item(product_item product_item) {
		this.product_item = product_item;
	}

	public String getTransID() {
		return transID;
	}

	public void setTransID(String transID) {
		this.transID = transID;
	}

	public LocalDate getTransDate() {
		return transDate;
	}

	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	

}
