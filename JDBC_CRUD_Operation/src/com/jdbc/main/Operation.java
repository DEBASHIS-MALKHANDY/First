package com.jdbc.main;

import java.util.Scanner;
import com.jdbc.info.*;

import com.jdbc.code.Dbservice;

public class Operation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int key = 0;
		boolean condition=true;
		Dbservice ds=new Dbservice();
		while(condition) {
			try {
				System.out.println("Enter A Choice");
				System.out.println("1. Insert");
				System.out.println("2. Select All");
				System.out.println("3. Select Employees By Id");
				System.out.println("4. Delete Employee");
				System.out.println("5. Upadate Employee");
				System.out.println("6. Exet The program");				
				key=sc.nextInt();
				switch(key){
				case 1:
					System.out.println("Enter E_Name");
					String name=sc.next();					
					System.out.println("Enter E_Address");
					String Address=sc.next();
					System.out.println("Enter:E_Salary");
					Integer Salary=sc.nextInt();
					ds.InsertEmployee(new Employees(name,Address,Salary));				
					break;
				case 2:
					ds.getEmployee();				
					break;
					
				case 3:
					ds.getEmployeebyId();
					break;
					
				case 4:
					ds.deleteEmployeebyId();
					break;
					
				case 5:
					System.out.println("Enter id of an Employee");
					int 
					break;
					
				case 6:
					condition=false;
				default:
					
					System.out.println("Incorect choce");
					break;
				
				}
			}
	
		catch(Exception e) {
					e.printStackTrace();
		  }

		}				
     }
}
