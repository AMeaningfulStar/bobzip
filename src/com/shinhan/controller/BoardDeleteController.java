package com.shinhan.controller;

import java.util.Scanner;

import com.shinhan.service.BoardService;
import com.shinhan.view.BoardView;

public class BoardDeleteController implements CommonControllerInterface{
	
	static Scanner sc = new Scanner(System.in);
	static BoardService boardservice = new BoardService();
	
	@Override
	public void execute() {
		System.out.print("삭제할 게시물 id를 입력하세요>> ");
		String board_id = sc.next();
		int result = boardservice.boardDeleteById(board_id);
		BoardView.display(result+"건의 게시물을 삭제하였습니다.");
	}
	
}
