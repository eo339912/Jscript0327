package com.yedam.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.board.Board;

public class EmpDAO {
	Connection conn = null;
	public EmpDAO() { //생성자
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passwd = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("정상적으로 연결되었습니다.");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("연결중 에러가 발생했습니다.");
			e.printStackTrace();
		}
	}
	
	public List<Student> getEmpList(){ //firstName => name, salary = age, email = school
		String sql = "select first_name, employee_id, email from emp";
		List<Student> list = new ArrayList<>();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				Student s1 = new Student(rs.getString("first_name"), 
										rs.getInt("employee_id"),
										rs.getString("email"));
				list.add(s1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Student getEmpListInfo(int id){ //한건조회
		String sql = "select employee_id, first_name, email from emp "
				+ "where employee_id = ?";
		
		Student st = new Student();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()) {
				st.setAge(rs.getInt("employee_id"));
				st.setName(rs.getString("first_name"));
				st.setSchool(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
		
	}
	
}
