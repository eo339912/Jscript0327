<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.yedam.board.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>getBoard.jsp</title>
<style>
        table {
            border-collapse: collapse;
            margin-top: 15px;
        }

         tr td, tr th {
            border: 1px solid #444;
            padding: 5px 10px
        }
    </style>
</head>
<body>
	<%
		String bNo = request.getParameter("boardNo");
		BoardDAO dao = new BoardDAO();
		Board brd = dao.getBoardInfo(Integer.parseInt(bNo));
		
		/* out.print("<h1>Hello</h1>");
		out.print("<h1>" + bNo + "page </h1>");
		out.print("<a href=\"getBoardList.html\">" + "list" + "</p>"); */
	%>
	<h1><a href="getBoardList.html">Board List</a></h1>
	<table>
		<tr>
			<td>BoardNO</td>
			<td><%= bNo %></td>
		</tr>
		<tr>
			<td>Content</td>
			<td><%=	brd.getbContent() %></td>
		</tr>
		<tr>
			<td>Write</td>
			<td><%=	brd.getbWriter() %></td>
		</tr>
		<tr>
			<td>date</td>
			<td><%=	brd.getbDate() %></td>
		</tr>
	</table>
</body>
</html>