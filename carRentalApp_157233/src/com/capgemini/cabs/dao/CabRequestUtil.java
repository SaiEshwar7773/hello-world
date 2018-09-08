package com.capgemini.cabs.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capgemini.cabs.ui.Client;


public class CabRequestUtil {
	public static Connection getConnection() {
		Connection conn = null;
		Logger logger =Client.logger;
		try {
			// DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			Class.forName(CabQueryMapper.DRIVER_CLASS);
			conn = DriverManager.getConnection(CabQueryMapper.URL,
					CabQueryMapper.UNAME, CabQueryMapper.PASSWORD);

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("DataBase connected");
		return conn;

	}
}
