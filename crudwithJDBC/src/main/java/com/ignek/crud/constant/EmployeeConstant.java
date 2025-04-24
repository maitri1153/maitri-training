package com.ignek.crud.constant;

public class EmployeeConstant {
	public static String PATH = "jdbc:mysql://localhost:3306/company";
	public static String USER_ID = "root";
	public static String PASSWORD = "ignek@12345";
	public static String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static String INSERT = "INSERT into Employee(name,email,gender,dob) VALUES (?,?,?,?);";
	public static String DELETE = "delete from Employee where emp_id=?;";
	public static String SELECT_USERS = "select * from Employee";
	public static String SELECT_USER_BY_ID = "select * from Employee where emp_id=?";
	public static String UPDATE = "update Employee set name=?, email=?,gender=?, dob=? where emp_id=?";
	public static String EMPLOYEE = "employee";
	public static String EMPLOYEE_LIST = "employeelist";
	public static String DELETE_ID = "delete_id";
	public static String EDIT_ID = "edit_id";
	public static String ID = "emp_id";
	public static String FULL_NAME = "fullName";
	public static String NAME = "name";
	public static String EMAIL = "email";
	public static String GENDER = "gender";
	public static String DOB = "dob";
}
