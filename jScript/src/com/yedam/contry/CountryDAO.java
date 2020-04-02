package com.yedam.contry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CountryDAO {
	Connection conn = null;
	
	public CountryDAO() {
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
	
	public List<Country> getCountryList(){ 
		String sql = "select * from countries";
		List<Country> list = new ArrayList<>();
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				Country ct = new Country(rs.getString("country_id"), 
										rs.getString("country_name"),
											rs.getInt("region_id"));
				list.add(ct);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
