package com.shinhan.service;

import com.shinhan.dao.InsertDAO;
import com.shinhan.dao.UpdateDAO;
import com.shinhan.dto.BoardDTO;

public class BoardService {

	InsertDAO insertDAO = new InsertDAO();
	UpdateDAO updateDAO = new UpdateDAO();

	public int memberInsert(BoardDTO board) {
		return insertDAO.memberInsert(board);
	}
	
	public int MemberUpdate(BoardDTO board) {
		return updateDAO.MemberUpdate(board);
	}
}
