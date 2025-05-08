package com.shinhan.view;

import java.util.List;

import com.shinhan.dto.BoardDTO;

public class BoardView {
	
	public static void display(BoardDTO board) {
		if(board == null) {
			display("해당하는 게시물이 존재하지 않습니다.");
			return;
		}
		System.out.println("게시물 정보: "+board);
	}

	private static void display(String message) {
		System.out.println("메시지|| " + message);
	}

	public static void display(List<BoardDTO> boardlist) {
		if (boardlist.size() == 0) {
			display("게시물이 존재하지 않습니다.");
			return;
		}
		System.out.println("==================== 게시글 목록 조회 ====================");
		boardlist.stream().forEach(board->System.out.println(board));
	}
}
