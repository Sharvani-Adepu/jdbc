package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//Create Connection
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
			System.out.println("Connection created");
			
			//Create Statement
			Statement mystate=(Statement) mycon.createStatement();
			System.out.println("Statement created");
			
			//query execute
			ResultSet rs=mystate.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getNString("empname")+" "+rs.getNString("emprole"));
			}
					  
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
