package com.ignek.crud.servlet;

import java.io.IOException;
import java.util.List;
import com.ignek.crud.dao.EmployeeDAO;
import com.ignek.crud.dto.Employee;
import com.ignek.crud.constant.EmployeeConstant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(InsertServlet.class.getName());

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Employee> employeelist = EmployeeDAO.getAllEmployees();
		logger.info("Printing data on screen");
		request.setAttribute(EmployeeConstant.EMPLOYEE_LIST, employeelist);
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException {
		try {
			String ID = request.getParameter(EmployeeConstant.ID);
			String name = request.getParameter(EmployeeConstant.FULL_NAME);
			String email = request.getParameter(EmployeeConstant.EMAIL);
			String gender = request.getParameter(EmployeeConstant.GENDER);
			String dob = request.getParameter(EmployeeConstant.DOB);
			if (ID.isBlank()) {
				logger.info("Insert operation is started");
				Employee employee = new Employee(name, email, gender, dob);
				EmployeeDAO.insertEmployee(employee);
				logger.info("Insert operation is completed successfully");
			} else {
				logger.info("Update operation is started");
				int empId = Integer.parseInt(request.getParameter(EmployeeConstant.ID));
				Employee employee = new Employee(empId, name, email, gender, dob);
				EmployeeDAO.updateEmployee(employee);
				logger.info("Update operation is completed successfully");
			}

		} catch (Exception e) {
			logger.warn("Exception Occures");
			e.printStackTrace();
		}
		doGet(request, response);
	}
}
