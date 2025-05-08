package com.shinhan.service;

import java.util.List;

import com.shinhan.dao.BoardselectDAO;
import com.shinhan.dto.BoardDTO;

public class BoardService {
	
	BoardselectDAO boardselectDAO = new BoardselectDAO();
	
	public List<BoardDTO> selectALL(){
		return boardselectDAO.selectALL();
	}

	public BoardDTO selectById(String board_id) {
		return boardselectDAO.selectById(board_id);
	}

}
