package com.ignek.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ignek.crud.connection.DBConnection;
import com.ignek.crud.dto.Employee;
import com.ignek.crud.constant.EmployeeConstant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeDAO {
	
	private static final Logger logger = LogManager.getLogger(EmployeeDAO.class.getName());

	protected static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DBConnection.initializeDatabase();
		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void insertEmployee(Employee employee) throws SQLException {
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(EmployeeConstant.INSERT)) {
			preparedStatement.setString(1, employee.getFullName());
			preparedStatement.setString(2, employee.getEmail());
			preparedStatement.setString(3, employee.getGender());
			preparedStatement.setString(4, employee.getDob());
			preparedStatement.executeUpdate();
			logger.info("Data Inserted Sucessfully.");
		} catch (SQLException e) {
			logger.warn("Error occured while Inserting data...");
			e.printStackTrace();
		}
	}

	public static void deleteEmployee(int ID) throws SQLException {
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(EmployeeConstant.DELETE);) {
			statement.setInt(1, ID);
			statement.executeUpdate();
			logger.info("Data deleted Sucessfully...");
		} catch (SQLException e) {
			logger.warn("Error occured while deleting data...");
			e.printStackTrace();
		}
	}

	public static List<Employee> getAllEmployees() { 
		List<Employee> employeelist = new ArrayList<>();
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(EmployeeConstant.SELECT_USERS);) {
			ResultSet resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				int empId = resultset.getInt(EmployeeConstant.ID);
				String name = resultset.getString(EmployeeConstant.NAME);
				String email = resultset.getString(EmployeeConstant.EMAIL);
				String gender = resultset.getString(EmployeeConstant.GENDER);
				String dob = resultset.getString(EmployeeConstant.DOB);
				employeelist.add(new Employee(empId, name, email, gender, dob));
				logger.info("Data fetch sucessfully.");
			}
		} catch (SQLException e) {
			logger.warn("Error occured while getting employee data.");
			e.printStackTrace();
		}
		return employeelist;
	}

	public static Employee getEmployee(int ID) { 
		Employee employee = null;
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection
						.prepareStatement(EmployeeConstant.SELECT_USER_BY_ID);) {
			preparedStatement.setInt(1, ID);
			ResultSet resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				int empId = resultset.getInt(EmployeeConstant.ID);
				String name = resultset.getString(EmployeeConstant.NAME);
				String email =resultset.getString(EmployeeConstant.EMAIL);
				String gender = resultset.getString(EmployeeConstant.GENDER);
				String dob = resultset.getString(EmployeeConstant.DOB);
				employee = new Employee(empId, name, email, gender, dob);
				logger.info("Employee data fetch Sucessfully with EmployeeID...");
			}
		} catch (SQLException e) {
			logger.warn("Error while getting employee data with id");
			e.printStackTrace();
		}
		return employee;
	}

	public static void updateEmployee(Employee employee) throws SQLException {
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(EmployeeConstant.UPDATE);) {
			statement.setString(1, employee.getFullName());
			statement.setString(2, employee.getEmail());
			statement.setString(3, employee.getGender());
			statement.setString(4, employee.getDob());
			statement.setInt(5, employee.getId());
			statement.executeUpdate();
			logger.info("Employee Data Updated Sucessfully.");
		} catch (SQLException e) {
			logger.warn("Get an exception while updating data");
			e.printStackTrace();
		}
	}
}
