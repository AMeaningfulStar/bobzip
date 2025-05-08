package com.shinhan.controller;

import java.util.Scanner;

import com.shinhan.service.BoardService;
import com.shinhan.view.BoardView;

public class BoardDeleteController{
	
	static Scanner sc = new Scanner(System.in);
	static BoardService boardservice = new BoardService();
	
	public void execute(String board_id) {
		int result = boardservice.boardDeleteById(board_id);
		BoardView.display(result+"건의 게시물을 삭제하였습니다.");
	}
	
}
