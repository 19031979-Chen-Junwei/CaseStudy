import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Transaction t1;
	private Transaction t2;
	
	private ArrayList<Transaction> transactionList;

	@Before
	public void setUp() throws Exception {
		t1 = new Transaction("T001", LocalDate.parse("2010-01-12"), "First transation"
				, "customer 1", "product food", "id1010", "andy");
		t2 = new Transaction("T002", LocalDate.parse("2010-10-10"), "2nd transation"
				, "customer 2", "product drink", "id2020", "bob");
		
		transactionList= new ArrayList<Transaction>();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
		
		//Add
		assertNotNull("Check if there is valid arraylist to add to", transactionList);
		assertEquals("Check the arraylist size is 1", 1, transactionList.size());
		
		//View all
		String allTransaction = C206_CaseStudy.viewTransaction(transactionList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allTransaction);
		
		
		
	}

}
