package com.shinhan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.shinhan.util.DButil;

public class BoarddeleteDAO {
	Connection conn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	int result;
	
	// 게시물 번호로 data 삭제하기
	public int boardDeleteById(String board_id) {
		result = 0;
		conn = DButil.getConnection();
		pst = null;
		String sql = "delete from board where board_id=?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, board_id);
			result = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
