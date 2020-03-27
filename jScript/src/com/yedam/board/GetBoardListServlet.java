package com.yedam.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class GetBoardListServlet
 */
@WebServlet("/GetBoardListServlet")
public class GetBoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetBoardListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		JSONObject obj = new JSONObject();
		JSONArray ary = new JSONArray();

		BoardDAO dao = new BoardDAO();
		for (Board d : dao.getBoardList()) {
			obj.put("board_no", d.getbNo());
			obj.put("writer", d.getbWriter());
			obj.put("content", d.getbContent());
			obj.put("board_date", d.getbDate());
			ary.add(obj);
		}
		PrintWriter out = response.getWriter();
		out.print(ary.toString());

		/*
		 * BoardDAO dao = new BoardDAO(); List<Board> bdList = dao.getBoardList();
		 * String bdJson = "[\r\n"; int rCnt = 0; int totalCnt = bdList.size();
		 * for(Board d : bdList) { bdJson += "{\"bNo\":"+d.getbNo()
		 * +",\"bWriter\":\""+d.getbWriter() +",\"bContent\":\""+d.getbContent()
		 * +"\",\"bDate\":\""+d.getbDate()+"\"}\r\n"; if(++rCnt != totalCnt) bdJson +=
		 * ","; }
		 * 
		 * bdJson += "]";
		 * 
		 * PrintWriter out = response.getWriter(); out.print(bdJson.toString());
		 */

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
