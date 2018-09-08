package com.capgemini.cabs.ui;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.exceptions.CabAppExceptions;
import com.capgemini.cabs.service.CabService;

public class Client {
	public static	Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) throws CabAppExceptions {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("resources//log4j.properties");
		CabService cs = new CabService();
		
		System.out.println("1) Raise Cab Request");
		System.out.println("2) Exit");
		Scanner sc = new Scanner(System.in);
		int choice =sc.nextInt();
		
		switch (choice) {
		case 1:
			//Taking input from the CabRequest.
			try{
			System.out.println("Enter Name of the customer:");
			String cname=sc.next();
			System.out.println("Enter customer phone number:");
			String phno=sc.next();
			System.out.println("Enter Pick up address:");
			String addr=new String();
					addr=sc.next();
			System.out.println("Enter Pin Code:");
			String pcode=sc.next();
			
			//Storing employee input into pojo class object.
			CabRequest cabRequest = new CabRequest();
			cabRequest.setCustomer_name(cname);
			cabRequest.setPhone_number(phno);
			cabRequest.setAddress_of_pickup(addr);
			cabRequest.setPincode(pcode);
			
			if(cs.addCabRequestDetails(cabRequest) > 0){
				//System.out.println(cs.addCabRequestDetails(cabRequest)); 
				cs.validateDonor(cabRequest);
				logger.info("Added info from Client Class");
				System.out.println("Your cab Request has been successfully registered, Your request ID is :<"+cabRequest.getRequest_id()+">");
			}else{
					System.out.println("Is not added");
				}
			sc.close();
			}
			
			catch(Exception e){
				e.printStackTrace();
			}
			
			break;
		case 2:
			logger.error("Pogram Exited.");
			
			System.exit(0);
			break;
		

		default:
			break;
		}
		
		
	}

}
