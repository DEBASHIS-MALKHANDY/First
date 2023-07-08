package com.jdbc.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.info.Employees;
import com.jdbc.utll.jdbcutil;

public class Dbservice {
	
	Scanner scan=new Scanner(System.in);
	jdbcutil jui=new jdbcutil();
	Connection connect=null;
	
	
	public void InsertEmployee(Employees emp) throws SQLException {
		String sqlInsertQuery = "insert into Employee_details(`E_Name`,`Eaddress`,`E_Salary`)values(?,?,?)";
		connect=jui.getConnection();
		PreparedStatement pre=connect.prepareStatement(sqlInsertQuery);
		if(pre!=null) {
			pre.setString(1, emp.getEmployeeName());
			pre.setString(2, emp.getEmployeeAddress());
			pre.setInt(3, emp.getEmployeeSalary());
		}
		
		int rowCount = pre.executeUpdate();
		if(rowCount>0) {
		System.out.println("Insert Data succsfully");
		}else {
			System.out.println("Not SuccesFull");
		}
	}//End Dbservice
	
	public void getEmployee() throws SQLException {
		String sqlRetriveQuery="select * from Employee_details";
		connect=jui.getConnection();
		Statement state=connect.createStatement();
		ResultSet rs=state.executeQuery(sqlRetriveQuery);{
		
		while(rs.next()) {
			printemp(new Employees(rs.getInt(1),rs.getNString(2),rs.getNString(3),rs.getInt(4)));
		}
		
	}
	}
	public void printemp(Employees ems) {
		System.out.println("Employee ID is-"+ems.getEmployeeId());
		System.out.println("Employee Name is-"+ems.getEmployeeName());
		System.out.println("Employee Address Name is-"+ems.getEmployeeAddress());
		System.out.println("Employee Salay Name is-"+ems.getEmployeeSalary());
		System.out.println("---------------------------------------------------");
	}
	
	public boolean getEmployeebyId() throws SQLException {
		boolean found=false;
		System.out.println("enter emp id");
		int ids=scan.nextInt();
		String sqlRetriveQuerybyId="select * from Employee_details where E_Id ="+ids;
		connect=jui.getConnection();
		Statement state1=connect.createStatement();
		ResultSet rs=state1.executeQuery(sqlRetriveQuerybyId);
		if(rs.next()) {
			found=true;
			printemp(new Employees(rs.getInt(1),rs.getNString(2),rs.getNString(3),rs.getInt(4)));
		}else {
			System.out.println("User This Id not found by System");
		}
		return found;
	}
	
	public void deleteEmployeebyId() throws SQLException{
		System.out.println("Enter Employee Id-Which You Want To Delete!");
		int ids=scan.nextInt();
		String sqlDeleteRowbyId="DELETE From Employee_details where E_Id ="+ids;
		connect=jui.getConnection();
		Statement state=connect.createStatement();
		int rowcount=state.executeUpdate(sqlDeleteRowbyId);
		if(rowcount>0) {
			System.out.println("Delete Data succsfully");
			}else {
				System.out.println("Not SuccesFull");
			}
    }
	
	public void updateEmployee(Employees es) {
		//System.out.println("Enter the id of Employee");
		try {
			   String sql = "UPDATE employee_details SET column1 = ?, column2 = ?, column3 = ? WHERE id = ?";
			   PreparedStatement statement = connect.prepareStatement(sql);
			   statement.setString(1, "new_value1");
			   statement.setString(2, "new_value2");
			   statement.setInt(3, 456);
			   statement.setInt(4, 1);
			   statement.executeUpdate();
			   System.out.println("Record updated.");
			} catch (SQLException e) {
			   e.printStackTrace();
			}
		
	}
}
