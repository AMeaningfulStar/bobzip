package com.shinhan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.shinhan.DTO.BoardDTO;
import com.shinhan.util.DButil;


public class UpdateDAO {
	
	public int MemberUpdate(BoardDTO board) {
		int result = 0; // 건수만 리턴
		
		Connection conn = DButil.getConnection();
		PreparedStatement st = null;
		
		Map<String, Object> dynamicSQL = new HashMap<>();
		
		if(board.getTitle() != null) dynamicSQL.put("BOARD_ID", board.getTitle());
		if(board.getCate() != null) dynamicSQL.put("CATE", board.getCate());
		if(board.getContents() != null) dynamicSQL.put("CONTENTS", board.getContents());
		if(board.getNickname() != null) dynamicSQL.put("NICKNAME", board.getNickname());
		
		String sql = "update board set ";
		String sql2 = " where board_id = ?";
		
		for(String key:dynamicSQL.keySet()) {
			sql += key + "=" + "?," ;
		}
		sql = sql.substring(0, sql.length()-1); // 마지막 , 삭제
		sql += sql2;
		System.out.println(sql);
		
		try {
			st = conn.prepareStatement(sql);
			
			int i=1;
			for(String key:dynamicSQL.keySet()) {
		 		st.setObject(i++, dynamicSQL.get(key));
		 	}
			st.setString(i, board.getBoard_id());
			
			result = st.executeUpdate(); 
		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return result;
	}
	
}
