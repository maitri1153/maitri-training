package com.ignek.crud.servlet;

import java.io.IOException;
import com.ignek.crud.dao.EmployeeDAO;
import com.ignek.crud.dto.Employee;
import com.ignek.crud.constant.EmployeeConstant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(EditServlet.class.getName());

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			logger.info("EditServlet is started");
			int editId = Integer.parseInt(request.getParameter(EmployeeConstant.EDIT_ID));
			Employee employee = EmployeeDAO.getEmployee(editId);
			request.setAttribute(EmployeeConstant.EMPLOYEE, employee);
			request.getRequestDispatcher("register.jsp").forward(request, response);
		} catch (Exception e) {
			logger.warn("Exception Occures in EditServlet");
			e.printStackTrace();
		}
	}
}
