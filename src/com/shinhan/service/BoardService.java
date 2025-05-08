package com.shinhan.service;

import com.shinhan.DTO.BoardDTO;
import com.shinhan.dao.InsertDAO;
import com.shinhan.dao.UpdateDAO;

public class BoardService {
	
	BoardselectDAO boardselectDAO = new BoardselectDAO();
	
	public List<BoardDTO> selectALL(){
		return boardselectDAO.selectALL();
	}

	public BoardDTO selectById(String board_id) {
		return boardselectDAO.selectById(board_id);
	}

	InsertDAO insertDAO = new InsertDAO();
	UpdateDAO updateDAO = new UpdateDAO();

	public int memberInsert(BoardDTO board) {
		return insertDAO.memberInsert(board);
	}
	
	public int MemberUpdate(BoardDTO board) {
		return updateDAO.MemberUpdate(board);
	}
}
