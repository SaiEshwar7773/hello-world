package com.capgemini.cabs.dao;

public class CabQueryMapper {
	public static final String INSERT_QUERY = "insert into cab_request values(seq_request_id.nextval,?,?,SYSDATE,?,?,?,?)";
	
	public static final String QUERY_SEQUENCE="SELECT seq_request_id.currval FROM DUAL";
	
	
	public static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";

	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";

	public static final String UNAME = "SYSTEM";
	public static final String PASSWORD = "orcl11g";
}
