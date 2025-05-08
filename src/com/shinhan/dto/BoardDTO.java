package com.shinhan.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
@Data
public class BoardDTO {
	 private String board_id;
	 private String title;
	 private String cate;
	 private String contents;
	 private Date wdate;
	 private String nickname; 
}