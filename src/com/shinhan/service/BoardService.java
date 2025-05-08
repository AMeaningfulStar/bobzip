package com.shinhan.service;

import com.shinhan.DTO.BoardDTO;
import com.shinhan.dao.InsertDAO;

public class BoardService {

	InsertDAO insertDAO = new InsertDAO();

	public int memberInsert(BoardDTO board) {
		return insertDAO.memberInsert(board);
	}
}
