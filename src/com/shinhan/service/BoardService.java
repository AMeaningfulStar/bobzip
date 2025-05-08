package com.shinhan.service;


import com.shinhan.dto.BoardDTO;

import java.util.List;

import com.shinhan.dao.BoardselectDAO;
import com.shinhan.dao.InsertDAO;
import com.shinhan.dao.UpdateDAO;

public class BoardService {
	
	BoardselectDAO boardselectDAO = new BoardselectDAO();
	BoarddeleteDAO boarddeleteDAO = new BoarddeleteDAO();
	
	public List<BoardDTO> selectALL(){
		return boardselectDAO.selectALL();
	}

	public BoardDTO selectById(String board_id) {
		return boardselectDAO.selectById(board_id);
	}
	
	public int boardDeleteById(String board_id) {
		return boarddeleteDAO.boardDeleteById(board_id);
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
