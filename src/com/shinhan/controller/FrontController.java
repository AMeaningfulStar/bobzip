package com.shinhan.controller;

import java.util.List;
import java.util.Scanner;

import com.shinhan.dto.BoardDTO;
import com.shinhan.service.BoardService;
import com.shinhan.util.DateUtil;

public class FrontController {
	static Scanner input = new Scanner(System.in);
	// user 값을 저장하고 사용하기 위한 전역 변수
	static boolean user = false;
	static BoardService boardService = new BoardService();

	// Front Controller Main
	public static void main(String[] args) {
		// 서비스 종료 여부를 담당하는 변수
		boolean isServiceOff = false;

		// isServiceOff가 false이면 계속 반복
		while (!isServiceOff) {
			List<BoardDTO> dataList = boardService.selectALL();

			System.out.println("----------------------------------");
			for (int idx = 0; idx < dataList.size(); idx++) {
				System.out.println("[" + (idx + 1) + "]");
				System.out.println("제목: " + dataList.get(idx).getTitle());
				System.out.println("작성자: " + dataList.get(idx).getNickname());
				System.out.println("작성일: " + DateUtil.convertToString(dataList.get(idx).getWdate()));
				System.out.println("----------------------------------");
			}

			Display.displayStart();
			String startInput = input.nextLine();

			if (startInput.matches("\\d+")) {
				BoardDTO target = boardService.selectById(dataList.get(Integer.parseInt(startInput) - 1).getBoard_id());
				
				System.out.println("----------------------------------");
				System.out.println("제목: " + target.getTitle());
				System.out.println("작성자: " + target.getNickname());
				System.out.println("작성일: " + target.getWdate());
				System.out.println("내용: " + target.getContents());
				System.out.println("----------------------------------");
				boolean isView = false;
				
				while (!isView) {
					System.out.println("==================================");
					System.out.println("1. 수정");
					System.out.println("2. 삭제");
					System.out.println("3. 뒤로가기");
					System.out.println("==================================");
					System.out.print("원하시는 메뉴 번호를 선택하세요: ");
					int menuInput = input.nextInt();
					input.nextLine();

					switch (menuInput) {
					case 1 -> {
						new UpdateController().execute();
						break;
					}
					case 2 -> {
						new BoardDeleteController().execute(target.getBoard_id());
						break;
					}
					case 3 -> {
						isView = true;
					}
					default -> {
						Display.displayInputError("다시 입력해주세요.");
						continue;
					}
					}
				}
			} else {
				switch (startInput) {
				case "create" -> {
					new InsertController().execute();
				}
				case "exit" -> {
					isServiceOff = true;
				}
				default -> {
					Display.displayInputError("다시 입력해주세요.");
					continue;
				}
				}
			}
		}

		// scanner 반납
		input.close();
		// 서비스 종료 화면
		Display.displayExit();
	}
}
