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
				, "customer 1",1, "product food", "id1010", "andy", "return");
		t2 = new Transaction("T002", LocalDate.parse("2010-10-10"), "2nd transation"
				, "customer 2",2 ,"product drink", "id2020", "bob", "return");
		
		transactionList= new ArrayList<Transaction>();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
		// when array list is null
		assertEquals("Check the arraylist size is 0", 0, transactionList.size());
		
		//Add 1 transaction to the array list
		C206_CaseStudy.addTransaction(transactionList, t1);
		assertEquals (1, transactionList.size());
		
		//after adding 2 transaction, test if the size of the list is 2 - normal
		C206_CaseStudy.addTransaction(transactionList, t2);
		assertEquals("Test that chromebook arraylist size is 2", 2, transactionList.size());
		
		
		
	}

}
