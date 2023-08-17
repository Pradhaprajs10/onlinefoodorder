package com.ofos.Generics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.github.dockerjava.api.model.Driver;

public class DatabaseUtility {
	
	Connection con = null;
	/**
	 * This method is used to connect database
	 * @author Pradhap
	 * @throws SQLException
	 */
	public void connectToDatabase() throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver((java.sql.Driver) driver);
		con = DriverManager.getConnection(IPathConstants.dbURL,IPathConstants.dbUSERNAME,IPathConstants.dbPASSWORD);
	}
	/**
	 * This method is used to execute and update query
	 * @param query
	 * @param colmnNo
	 * @throws SQLException
	 */
	public void getExecteQuery(String query, int columnNo, String partialData) throws SQLException {
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag = false;
		while(result.next()) {
			String data = result.getString(columnNo);
			if(data.equalsIgnoreCase(partialData)) {
				flag = true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("data is verified");
		}
		else {
			System.out.println("data is not verified");
		}
	}
	
	public void closeDBConnection() throws Throwable {
		con.close();
	}

}
