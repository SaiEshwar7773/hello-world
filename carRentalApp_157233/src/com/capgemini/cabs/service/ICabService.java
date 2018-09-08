package com.capgemini.cabs.service;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.exceptions.CabAppExceptions;

public interface ICabService {
	int addCabRequestDetails(CabRequest cabrequest);
	public void validateDonor(CabRequest cabRequest) throws CabAppExceptions;
	
}
