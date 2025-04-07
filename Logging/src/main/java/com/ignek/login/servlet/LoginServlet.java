package com.ignek.login.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.ignek.login.constant.LoginConstant;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger();

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			logger.info("Welcome to LoginServlet.");
			String id = request.getParameter(LoginConstant.USER_ID);
			String password = request.getParameter(LoginConstant.PASSWORD);

			if ((id.equals(LoginConstant.USER_ID_VALUE)) && (password.equals(LoginConstant.PASSWORD_VALUE))) {
				logger.info("User_ID and Password matched");
				request.setAttribute(LoginConstant.MESSAGE, LoginConstant.SUCCESS_MESSAGE);
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			} else {
				logger.warn("Please enter valid user id and password");
				request.setAttribute(LoginConstant.MESSAGE, LoginConstant.FAIL_MESSAGE);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
