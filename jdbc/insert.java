package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			//Create Connection
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
			System.out.println("Connection created");
			
			//Create Statement
			Statement mystate=(Statement) mycon.createStatement();
			System.out.println("Statement created");
			
			System.out.println("Inserting records into table");
			String sql="INSERT INTO employee VALUES('empid','empname','emprole',empsalary)";
			mystate.executeUpdate(sql);
			System.out.println("record inserted");
			
			 
			
	}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
