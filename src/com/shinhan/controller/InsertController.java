package com.shinhan.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

import com.shinhan.dto.BoardDTO;
import com.shinhan.service.BoardService;
import com.shinhan.view.BoardView;

public class InsertController implements CommonControllerInterface{
	static Scanner sc = new Scanner(System.in);
	static BoardService boardService = new BoardService();
	
	@Override
	public void execute() {
		System.out.println("게시판에 등록할 정보를 입력해주세요.");
		
		System.out.print("게시글 제목(상호명)>> ");
		String title = sc.nextLine();
		
		System.out.print("해당 식당의 카테고리를 입력하세요(한식, 일식, 중식, 양식, 기타)>> ");
		String cate = sc.nextLine();
		
		System.out.print("게시글 내용을 입력해주세요>> ");
		String contents = sc.nextLine();
		
		System.out.print("닉네임을 입력해주세요>> ");
		String nickname = sc.nextLine();
		
		Date today = Date.valueOf(LocalDate.now());
		
		BoardDTO board = BoardDTO.builder()
						.board_id(UUID.randomUUID().toString().replace("-", ""))
						.title(title)
						.cate(cate)
						.contents(contents)
						.wdate(today)
						.nickname(nickname)
						.build();
		
		System.out.println(board);
		int result = boardService.memberInsert(board);
		BoardView.display(result + "건이 등록되었습니다.");
	}

}
