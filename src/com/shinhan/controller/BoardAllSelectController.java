package com.shinhan.controller;

import java.util.List;

import com.shinhan.dto.BoardDTO;
import com.shinhan.service.BoardService;
import com.shinhan.view.BoardView;

public class BoardAllSelectController implements CommonControllerInterface{
	
	static BoardService boardservice = new BoardService();

	@Override
	public void execute() {
		List<BoardDTO> boardlist = boardservice.selectALL();
		BoardView.display(boardlist);
	}
	
}
