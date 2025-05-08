package com.shinhan.controller;

import java.util.Scanner;

import com.shinhan.dto.BoardDTO;
import com.shinhan.service.BoardService;
import com.shinhan.view.BoardView;

public class BoardIDSelectController implements CommonControllerInterface{
	
	static Scanner sc = new Scanner(System.in);
	static BoardService boardservice = new BoardService();
	
	@Override
	public void execute() {
		System.out.print("조회할 게시판 id를 입력해주세요>> ");
		String board_id = sc.next();
		BoardDTO board = boardservice.selectById(board_id);
		BoardView.display(board);
	}
	
	
}
