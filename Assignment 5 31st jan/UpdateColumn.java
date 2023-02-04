package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

public class UpdateTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		String urlMySQL="jdbc:mysql://localhost:3306/hr";
		String username="root";
		String password="1234";
		String query="";
		boolean r=true;
		
		try {
			Connection con=DriverManager.getConnection(urlMySQL,username,password);
			System.out.println("Connection successful");
			while(r==true) {
			System.out.println("Enter the column to be updated :\n1.Name \n2.Age \n3.Address \n4.Course");
			int s=sc.nextInt();
			System.out.println("Enter your ID: ");
			i=sc.nextInt();
			switch(s) {
			case 1:
				System.out.println("Enter the updated name : ");
				String updatedname=sc.next();
			 query="update student set name='"+updatedname+"' where id='"+i+"'";
				break;
				
			case 2:
				System.out.println("Enter the updated Age : ");
				int updatedage=sc.nextInt();
				query="update student set age='"+updatedage+"' where id='"+i+"'";
				break;
			case 3:
				System.out.println("Enter the updated Address : ");
				int updatedAddress=sc.nextInt();
				query="update student set address='"+updatedAddress+"' where id='"+i+"'";
				break;
			case 4:
				System.out.println("Enter the updated course : ");
				int updatedcourse=sc.nextInt();
				query="update student set course='"+updatedcourse+"' where id='"+i+"'";
				break;
				
			default:
				System.out.println("Invalid choice!!");
				break;
			}
			Statement stmt=con.createStatement();
			int x=stmt.executeUpdate(query);
			System.out.println(x+" Record inserted successfully");
		 System.out.println("Do you waNt to continue ?(true or false)" );
			r=sc.nextBoolean();
			if(r==false) {
				System.out.println("Thank you !!");
				System.exit(0);
			}
		  //String query="update from student where id=1011";
		
		}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	
}
}
