package com.yedam.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class EmployeeFile {
	public static void main(String[] args) throws IOException {
		Connection conn = null;
		
		String user = "hr";
		String pass = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,pass);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		///
		List<Employee> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select first_name, salary from employees");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Employee(rs.getString("first_name"), rs.getInt("salary")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Stream<Employee> stream = list.stream();
		//System.out.println();
		//stream.forEach((s) -> System.out.println(s.getFirstname() + "," + s.getSalary())); 
		
		
		File file = new File("c:/Temp/employees.txt");
		if(file.exists() == false) { 
			file.createNewFile();			
		}
		
		OutputStream os = new FileOutputStream(file);
		//byte[] data = stream().getBytes();
		//os.write(data);
		os.flush();
		os.close();
		
	}

	
}
