package com.yedam.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DepartmentsDAO {
	Connection conn = null;
	
	public DepartmentsDAO() {
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
	}
	
	public List<Departments> getDepartmentsList(){ //전체조회
		
		String sql = "select * from departments order by department_id";
		
		
		List<Departments> list = new ArrayList<>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); //데이터를 가져와서 ResultSet에 담는다.
			while(rs.next()) {
				Departments ds = new Departments();
				ds.setdId(rs.getInt("department_id"));
				ds.setdLocationId(rs.getString("department_name"));
				ds.setdManagerId(rs.getString("manager_id"));
				ds.setdName(rs.getString("location_id"));
				
				list.add(ds);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
} //class_end
