package com.capgemini.cabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.dao.CabRequestDAO;
import com.capgemini.cabs.exceptions.CabAppExceptions;



public class CabService implements ICabService {
	CabRequestDAO cab= new CabRequestDAO();
	
	
	
	
	@Override
	public int addCabRequestDetails(CabRequest cabRequest) {
		// TODO Auto-generated method stub
		String pin =cabRequest.getPincode() ;
		if(cabRequest.getPincode()=="400096"){
			cabRequest.setRequest_status("Accepted");
			cabRequest.setCab_number("MH VS 2345");
			
		}
		
		else if(cabRequest.getPincode()=="411026"){
			cabRequest.setRequest_status("Accepted");
			cabRequest.setCab_number("MH VS 34567");
		}
		
		else if(cabRequest.getPincode()=="411013"){
			cabRequest.setRequest_status("Accepted");
			cabRequest.setCab_number("MH AN97886");
		}
		else if(pin=="560066"){
			System.out.println(" Working");
			cabRequest.setRequest_status("Accepted");
			cabRequest.setCab_number("MH AS 875");
		}
		else if(cabRequest.getPincode()=="382009"){
			cabRequest.setRequest_status("Accepted");
			cabRequest.setCab_number("MH KN 9856");
		}
		else if(cabRequest.getPincode()=="400708"){
			cabRequest.setRequest_status("Accepted");
			cabRequest.setCab_number("MH TF 8956");
		}
		else{
			cabRequest.setRequest_status("Not Accepted");
			cabRequest.setCab_number(null);
			System.out.println(cabRequest.getPincode());
		}
		
		//Client.logger.info("service class Initiated");
	
		return cab.addCabRequestDetails(cabRequest);
		
				
		
		
	}
	
	public void validateDonor(CabRequest cabRequest) throws CabAppExceptions
	{
		List<String> validationErrors = new ArrayList<String>();

		//Validating  name
		if(!(isValidName(cabRequest.getCustomer_name()))) {
			validationErrors.add("\n Donar Name Should Be In Alphabets and minimum 3 characters long ! \n");
		}
		/*Validating address
		if(!(isValidaddr(cabRequest.getAddress_of_pickup()))){
			validationErrors.add("\n Address Should Be Greater Than 5 Characters \n");
		}*/
		//Validating Phone Number
		if(!(isValidPhoneNumber(cabRequest.getPhone_number()))){
			validationErrors.add("\n Phone Number Should be in 10 digit \n");
		}
		//Validating pin Code
		if(!(isValidPinCode(cabRequest.getPincode()))){
			validationErrors.add("\n Pincode should be 5 digits. \n" );
		
		}
		if(!validationErrors.isEmpty())
			throw new CabAppExceptions(validationErrors +"");
	}

	public boolean isValidName(String name){
		Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(name);
		return nameMatcher.matches();
	}

	
	public boolean isValidPhoneNumber(String i){
		Pattern phonePattern=Pattern.compile("^[1-9]{1}[0-9]{9}$");
		Matcher phoneMatcher=phonePattern.matcher(i);
		return phoneMatcher.matches();
		
	}
	public boolean isValidPinCode(String i){
		Pattern phonePattern=Pattern.compile("^[1-9]{1}[0-9]{5}$");
		Matcher phoneMatcher=phonePattern.matcher(i);
		return phoneMatcher.matches();
		
	}
	
	
	

}
