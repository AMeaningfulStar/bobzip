package com.shinhan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.shinhan.DTO.BoardDTO;
import com.shinhan.util.DButil;


public class UpdateDAO {
	/*
	public int MemberUpdate(BoardDTO board) {
		int result = 0; // 건수만 리턴
		
		Connection conn = DButil.getConnection();
		PreparedStatement st = null;
		
		Map<String, Object> dynamicSQL = new HashMap<>();
		
		if(board.getTitle() != null) dynamicSQL.put("BOARD_ID", board.getPart_pw());
		if(member.getPart_name() != null) dynamicSQL.put("PART_NAME", member.getPart_name());
		if(member.getEmail() != null) dynamicSQL.put("EMAIL", member.getEmail());
		if(member.getPhone() != null) dynamicSQL.put("PHONE", member.getPhone());
		
		String sql = "update member set ";
		String sql2 = " where part_id = ?";
		
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
			st.setString(i, member.getPart_id());
			
			result = st.executeUpdate(); 
		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return result;
	}
	*/
}
