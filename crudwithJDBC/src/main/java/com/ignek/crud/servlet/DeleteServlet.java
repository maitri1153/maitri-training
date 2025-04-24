package com.ignek.crud.servlet;

import java.io.IOException;
import com.ignek.crud.dao.EmployeeDAO;
import com.ignek.crud.constant.EmployeeConstant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(DeleteServlet.class.getName());

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			logger.info("Delete operation is started");
			int deleteId = Integer.parseInt(request.getParameter(EmployeeConstant.DELETE_ID));
			EmployeeDAO.deleteEmployee(deleteId);
			logger.info("Delete operation is completed successfully");
			request.getRequestDispatcher("InsertServlet").forward(request, response);
		} catch (Exception e) {
			logger.warn("Exception Occures in DeleteServlet");
			e.printStackTrace();
		}
	}
}
