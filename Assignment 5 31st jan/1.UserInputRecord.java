package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

public class TestInsert2 {
	public static void main(String[] args) {
		
		String urlMySQL="jdbc:mysql://localhost:3306/hr";
		String username="root";
		String password="1234";
		int n=0;
		Scanner sc=new Scanner(System.in);
		String name,address;
		boolean r=true;
		int age, course;
		try {
			Connection con=DriverManager.getConnection(urlMySQL,username,password);
			System.out.println("Connection successful");
			while(n<5 && r) {
				System.out.println("Enter the values :name, age, address, course : ");
				name=sc.next();
				age=sc.nextInt();
				address=sc.next();
				course=sc.nextInt();
			String query="insert into student(name,age,address, course) values('"+name+"','"+age+"','"+address+"','"+course+"')";
			Statement stmt=con.createStatement();
			int x=stmt.executeUpdate(query);
		
					System.out.println(x+" Record inserted successfully. Do you want to continue ?(true or false)" );
					r=sc.nextBoolean();
					n++;
					if(r==false) {
						System.out.println("Thank you !!");
						System.exit(0);
					}
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
}
