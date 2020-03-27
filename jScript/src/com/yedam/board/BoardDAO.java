package com.yedam.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BoardDAO {
	
	Connection conn = null;
	
	public BoardDAO() {
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
	
	public Board getBoardInfo(int boardNO) {
		String sql = "select board_no, content, writer, create_date from board "
				+ "where board_no = ?" ;
		
		
		Board bd = new Board();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNO);
			ResultSet rs = pstmt.executeQuery(); //데이터를 가져와서 ResultSet에 담는다.
			
			if(rs.next()) {
				bd.setbNo(rs.getInt("board_no"));
				bd.setbContent(rs.getString("content"));
				bd.setbDate(rs.getString("create_date"));
				bd.setbWriter(rs.getString("writer"));	
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bd;
	}
	
	public void insertBoard(Board bd){ //한건입력
		String sql = "insert into board "
					+ "values((select nvl(max(board_no),0)+1 from board),"
					+ "?, ?, sysdate)";
		

		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bd.getbContent());
			pstmt.setString(2, bd.getbWriter());
			
			int iCnt = pstmt.executeUpdate(); //업데이트를 실행
			System.out.println( iCnt + "건 입력.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public List<Board> getBoardList(){
		
		String sql = "select board_no, content, writer, create_date from board order by board_no desc";
		

		
		List<Board> list = new ArrayList<>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); //데이터를 가져와서 ResultSet에 담는다.
			while(rs.next()) {
				Board bd = new Board();
				bd.setbContent(rs.getString("content"));
				bd.setbDate(rs.getString("create_date"));
				bd.setbNo(rs.getInt("board_no"));
				bd.setbWriter(rs.getString("writer"));
				
				list.add(bd);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
