package com.ignek.crud.servlet;

import java.io.IOException;
import java.util.List;
import org.apache.catalina.tribes.util.Arrays;
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
		logger.info("Read data from database.");
		List<Employee> employeelist = EmployeeDAO.getAllEmployees();	
		request.setAttribute(EmployeeConstant.EMPLOYEE_LIST, employeelist);
		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException {
		try {
			logger.info("Startrd InsertServlet.");
			String id = request.getParameter(EmployeeConstant.ID);
			String name = request.getParameter(EmployeeConstant.FULL_NAME);
			String email = request.getParameter(EmployeeConstant.EMAIL);
			String gender = request.getParameter(EmployeeConstant.GENDER);
			String dob = request.getParameter(EmployeeConstant.DOB);
			String[] hobbylist = request.getParameterValues(EmployeeConstant.HOBBY);
			String hobby = Arrays.toString(hobbylist);
			if (id.isBlank()) {
				logger.info("Startrd insertEmployee function...");
				Employee employee = new Employee(name, email, gender, dob, hobby);
				EmployeeDAO.insertEmployee(employee);
				EmployeeConstant.valid = true;
			} else {
				logger.info("Startrd updateEMployee function...");
				int emp_id = Integer.parseInt(request.getParameter(EmployeeConstant.ID));
				Employee employee = new Employee(emp_id, name, email, gender, dob, hobby);
				EmployeeDAO.updateEmployee(employee);
				EmployeeConstant.valid = true;
			}

		} catch (Exception e) {
			logger.warn("Exception Occures in InsertServlet");
			e.printStackTrace();
		}
		doGet(request, response);
	}
}
