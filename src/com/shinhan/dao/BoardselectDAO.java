package com.shinhan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shinhan.dto.BoardDTO;
import com.shinhan.util.DButil;

public class BoardselectDAO {
	
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;

	// 게시판 전부 조회
	public List<BoardDTO> selectALL() {
	    List<BoardDTO> boardlist = new ArrayList<>();
	    Connection conn = null;
	    PreparedStatement pst = null;
	    ResultSet rs = null;

	    String sql = "SELECT board_id, title, cate, nickname FROM board";

	    try {
	        conn = DButil.getConnection();
	        pst = conn.prepareStatement(sql);
	        rs = pst.executeQuery();

	        while (rs.next()) {
	            BoardDTO board = new BoardDTO();
	            board.setBoard_id(rs.getString("board_id"));
	            board.setTitle(rs.getString("title"));
	            board.setCate(rs.getString("cate"));
	            board.setNickname(rs.getString("nickname"));
	            boardlist.add(board);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pst != null) pst.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return boardlist;
	}
	
	// 게시판 상세조회 (1건 조회)
	public BoardDTO selectById(String board_id) {
		conn = DButil.getConnection();
		pst = null;
		rs = null;
		BoardDTO board = null;
		
		String sql = "select * from board where board_id = ?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, board_id);
			rs = pst.executeQuery();
			if(rs.next()) {
				board = BoardDTO.builder()
						.board_id(rs.getString("board_id"))
						.title(rs.getString("title"))
						.cate(rs.getString("cate"))
						.contents(rs.getString("contents"))
						.wdate(rs.getDate("wdate"))
						.nickname(rs.getString("nickname"))
						.build();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DButil.dbDisconnect(conn, pst, rs);
		}
		return board;
	}
	
}
