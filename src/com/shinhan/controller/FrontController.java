package com.shinhan.controller;

import java.util.Scanner;

public class FrontController {
	static Scanner input = new Scanner(System.in);
	// user 값을 저장하고 사용하기 위한 전역 변수
	static boolean user = false;

	// Front Controller Main
	public static void main(String[] args) {
		// 서비스 종료 여부를 담당하는 변수
		boolean isServiceOff = false;

		// isServiceOff가 false이면 계속 반복
		while (!isServiceOff) {
			// <- 여기에 목록 불러오면 됩니다!!
			Display.displayStart();
			String startInput = input.nextLine();

			if (startInput.matches("\\d+")) {
				// DTO target = dataList.get(Integer.parseInt(startInput) - 1);
				// 게시글 번호로 불러오기
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
