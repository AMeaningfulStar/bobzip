package com.shinhan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shinhan.DTO.BoardDTO;
import com.shinhan.util.DButil;

public class InsertDAO {
	public int memberInsert(BoardDTO board) {
		int result = 0; // 건수만 리턴
		
		Connection conn = DButil.getConnection();
		PreparedStatement st = null;
		String sql = """
				insert into board(
				board_id,
				title,
				cate,
				contents,
				wdate,
				nickname)
				values(?,?,?,?,?)
				""";
		
		try {
			st = conn.prepareStatement(sql);
			
			st.setString(1, board.getBoard_id());
			st.setString(2, board.getTitle());
			st.setString(3, board.getCate());
			st.setString(4, board.getContents());
			st.setDate(5, board.getWdate());
			st.setString(6, board.getNickname());
			result = st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
