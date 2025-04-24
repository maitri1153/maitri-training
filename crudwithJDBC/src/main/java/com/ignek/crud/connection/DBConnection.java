package com.ignek.crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.ignek.crud.constant.EmployeeConstant;

public class DBConnection {
	private static final Logger logger = LogManager.getLogger(DBConnection.class.getName());

	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
		Connection connection = null;
		try {
			Class.forName(EmployeeConstant.DRIVER);
			connection = DriverManager.getConnection(EmployeeConstant.PATH, EmployeeConstant.USER_ID,
					EmployeeConstant.PASSWORD);
			logger.info("Connection is established");
			return connection;
		} catch (Exception e) {
			logger.warn("Exception Occurs while Connecting to database.");
			e.printStackTrace();
		}
		return connection;
	}
}
