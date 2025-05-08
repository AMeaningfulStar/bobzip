package com.shinhan.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.shinhan.dto.BoardDTO;
import com.shinhan.service.BoardService;
import com.shinhan.view.BoardView;

public class UpdateController implements CommonControllerInterface{
	static Scanner sc = new Scanner(System.in);
	static BoardService boardService = new BoardService();
	
	
	@Override
	public void execute() {
		System.out.println("수정할 게시판 번호를 입력하세요.");
		String board_id = sc.nextLine();
		
		System.out.println("수정할 정보를 입력하세요. 수정을 원치 않는 정보는 *을 입력해주세요.");

		System.out.print("게시글 제목(상호명)>> ");
		String title = sc.nextLine();
		if(!title.equals("*")) title = null;
		
		List<String> validCates = List.of("한식", "일식", "중식", "양식", "기타");
		String cate = "";
		while(true) {
			System.out.print("해당 식당의 카테고리를 입력하세요(한식, 일식, 중식, 양식, 기타)>> ");
			cate = sc.nextLine().trim();
			if (validCates.contains(cate)) {
				break;
			}
			System.out.println("❌ 잘못된 카테고리입니다. 한식, 일식, 중식, 양식, 기타 중 하나를 정확히 입력해주세요.");
		}
		if(!cate.equals("*")) title = null;
		
		System.out.print("게시글 내용을 입력해주세요>> ");
		String contents = sc.nextLine();
		if(!contents.equals("*")) title = null;
		
		System.out.print("닉네임을 입력해주세요>> ");
		String nickname = sc.nextLine();
		if(!nickname.equals("*")) title = null;
		
		Date today = Date.valueOf(LocalDate.now());
		
		BoardDTO board = BoardDTO.builder()
						.board_id(board_id)
						.title(title)
						.cate(cate)
						.contents(contents)
						.wdate(today)
						.nickname(nickname)
						.build();
		
		int result = boardService.MemberUpdate(board);
		BoardView.display(result + "건이 수정되었습니다.");
		BoardView.display("수정일시: " + today);
	}

}
