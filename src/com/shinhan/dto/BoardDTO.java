package com.shinhan.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDTO {
	 private String board_id;
	 private String title;
	 private String cate;
	 private String contents;
	 private Date wdate;
	 private String nickname; 
}
