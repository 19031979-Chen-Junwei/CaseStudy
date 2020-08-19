
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19006252, 12 Aug 2020 4:26:35 pm
 */

public class product {

	private int product_id;
	private String category;
	private double price;
	private String vendor;

	public product(int product_id, String category, double price, String vendor) {

		this.product_id = product_id;
		this.category = category;
		this.price = price;
		this.vendor = vendor;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
