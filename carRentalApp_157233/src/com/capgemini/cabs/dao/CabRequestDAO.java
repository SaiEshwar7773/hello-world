package com.capgemini.cabs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capgemini.cabs.bean.CabRequest;
import com.capgemini.cabs.ui.Client;




public class CabRequestDAO implements ICabRequestDAO {
	Logger logger =Client.logger;
	
	@Override
	public int addCabRequestDetails(CabRequest cabRequest) {
		// TODO Auto-generated method stub
		Connection conn = CabRequestUtil.getConnection();
		int n = 0;
		


		try {
			PreparedStatement pstmt = conn
					.prepareStatement(CabQueryMapper.INSERT_QUERY);
			
			
			
			
			pstmt.setString(1, cabRequest.getCustomer_name());
			pstmt.setString(2, cabRequest.getPhone_number());
			pstmt.setString(3, cabRequest.getRequest_status());
			pstmt.setString(4, cabRequest.getCab_number());
			pstmt.setString(5, cabRequest.getAddress_of_pickup());
			pstmt.setString(6, cabRequest.getPincode());
			n = pstmt.executeUpdate();
			

			PreparedStatement pstmt2 = conn.prepareStatement(CabQueryMapper.QUERY_SEQUENCE);
			
			
			ResultSet resultSet = pstmt2.executeQuery();

			if(resultSet.next())
			{
				cabRequest.setRequest_id(resultSet.getInt(1));
						
			}
			
			
		//	System.out.println("dao class Initiated");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			logger.error("Error in add methd");
			
		}
		logger.info("Added to data base");
		return n;
		
	}

}
