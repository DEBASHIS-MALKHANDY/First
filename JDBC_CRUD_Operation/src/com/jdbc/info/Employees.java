package com.jdbc.info;

public class Employees {
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private Integer employeeSalary;
	
	public Employees(int employeeId, String employeeName, String employeeAddress, Integer employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}
	public Employees(String employeeName, String employeeAddress, Integer employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public Integer getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
}
