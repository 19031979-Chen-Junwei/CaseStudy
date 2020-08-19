import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19006252, 19 Aug 2020 2:36:30 pm
 */
public class C206_CaseStudy_Test {
	private product product1;
	private product product2;
	private ArrayList<product> productList;

	@Before
	public void setUp() throws Exception {
		// prepare test data
		product1 = new product(1, "drinks", 3.00, "liho");
		product2 = new product(2, "foods", 2.00, "burger");

		productList = new ArrayList<product>();

	}

	@Test
	public void addProductTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Camcorder arraylist to add to", productList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.addProduct(productList, product1);
		assertEquals("Check that product arraylist size is 1", 1, productList.size());
		assertSame("Check that new product is added", product1, productList.get(0));
	}

	public void retrieveAllProductTest() {
		// Test if product list is not null but empty -boundary
		assertNotNull("Test if there is valid product arraylist to retrieve item", productList);

		// test if the list of product retrieved from the SourceCentre is empty -
		// boundary
		String allproduct = C206_CaseStudy.viewAllProduct(productList);
		String testOutput = "";
		assertEquals("Check that ViewAllProductlist", testOutput, allproduct);
	}
	public void deleteProduct() {
		
		assertNotNull("Test if there is valid product arraylist to delete item", productList);
		
	}
}
