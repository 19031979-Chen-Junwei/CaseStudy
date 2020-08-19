import static org.junit.Assert.assertNotNull;

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
	public void addCamcorderTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Camcorder arraylist to add to", productList);

	}
}
