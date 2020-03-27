package com.yedam.board;

import java.util.List;

public class BoardMain {
	public static void main(String[] args) {
		
		BoardDAO b = new BoardDAO();
		/*
		List<Board> blist = b.getBoardList();
		
		for(Board bd : blist) {
			System.out.println(bd);
		}
		*/
		//한건입력
		/*
		Board board = new Board();
		board.setbWriter("user3");
		board.setbContent("java test");
		
		b.insertBoard(board);
		*/
		//한건보기
		Board gBI = b.getBoardInfo(2);
		System.out.println(gBI);
	}
}
