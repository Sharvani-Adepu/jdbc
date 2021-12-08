package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				try {
					
					//Create Connection
					Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
					System.out.println("Connection created");
					
					//Create Statement
					Statement mystate=(Statement) mycon.createStatement();
					System.out.println("Statement created");
					
					//query execute
					System.out.println("Inserting records");
					int rs=mystate.executeUpdate("INSERT INTO `mydatabase`.`employee` (`empid`, `empname`, `emprole`, `empsalary`) VALUES ('10', 'fdrt', 'gyhg', '77773')");	
			        System.out.println("Records inserted");			  
				}catch(Exception e) {
					e.printStackTrace();
				}


	}

}
