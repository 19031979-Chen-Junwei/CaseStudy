import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {
	private String transID;
	private LocalDate transDate;
	private String description;
	private String customer;
	private String product;
	private String staffID;
	private String staffName;
	
	public Transaction(String transID, LocalDate transDate, String description, String customer, String product,
			String staffID, String staffName) {
		this.transID = transID;
		this.transDate = transDate;
		this.description = description;
		this.customer = customer;
		this.product = product;
		this.staffID = staffID;
		this.staffName = staffName;
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

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
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
