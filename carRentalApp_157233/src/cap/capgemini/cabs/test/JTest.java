package cap.capgemini.cabs.test;

import static org.junit.Assert.assertEquals;


import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.dao.CabRequestDAO;
import com.capgemini.cabs.exceptions.CabAppExceptions;


public class JTest {
	static CabRequestDAO dao;
	static CabRequest cab;

	@BeforeClass
	public static void initialize() {
		System.out.println("in before class");
		dao = new CabRequestDAO();
		cab = new CabRequest();
	}



	@Test
	public void testAddDonarDetails2() throws CabAppExceptions {
		cab.setCustomer_name("John");
		cab.setPhone_number("9768587350");
		cab.setAddress_of_pickup("Capgemini");
		cab.setPincode("400708");
		
		assertEquals(1,dao.addCabRequestDetails(cab));
	}
	

}
