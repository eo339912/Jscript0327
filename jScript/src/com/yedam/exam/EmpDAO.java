package com.yedam.exam;

import java.io.FileReader;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class EmpDAO {
	Connection conn = null;
	public EmpDAO() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println("정상적인 드라이버가 아닙니다");
		} catch (SQLException e) {
			System.out.println("접속정보를 확인하세요");
		}
	}
	public List<Employee> getEmpList(){
		List<Employee> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select first_name, salary from employees");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new Employee(rs.getString("first_name"),
						rs.getInt("salary")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;		
	}
}
