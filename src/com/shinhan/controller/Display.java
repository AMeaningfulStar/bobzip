package com.shinhan.controller;

import java.util.Scanner;

public class Display {
	public static void displayStart() {
		System.out.println("==================================");
		System.out.println("      BobZip 맛집 리뷰 게시판     ");
		System.out.println("==================================");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 프로그램 종료");
		System.out.println("==================================");
		System.out.print("원하시는 메뉴 번호를 선택하세요: ");
	}
	
	public static void displayInputError(String context) {
		System.out.println("⚠ 잘못된 입력입니다. " + context);
		System.out.println("==================================");
	}

	public static void displayError(String context) {
		System.out.println(context);
		System.out.println("==================================");
	}
	
	public static boolean displayContinue(Scanner input) {
		while (true) {
			System.out.println("==================================");
			System.out.println("1. 다시 시도");
			System.out.println("2. 뒤로가기");
			System.out.println("==================================");
			System.out.print("원하시는 메뉴 번호를 선택하세요: ");
			int isContinue = input.nextInt();
			input.nextLine();

			switch (isContinue) {
			case 1 -> {
				return true;
			}
			case 2 -> {
				return false;
			}
			default -> {
				displayInputError("1번 또는 2번 중 하나를 선택해주세요.");
				continue;
			}
			}
		}
	}
	
	public static void displayExit() {
		System.out.println(" ");
		System.out.println("==========    ======    ==========");
		System.out.println("========  =====    =====  ========");
		System.out.println("=======   ==Good Bye!!!==  =======");
		System.out.println("========  ==============  ========");
		System.out.println("==========  ==========  ==========");
		System.out.println("============  ======  ============");
		System.out.println("================   ===============");
		System.out.println(" ");
		System.out.println("🔒 BobZip 서비스를 종료합니다.");
		System.out.println("✋ 다음에 또 만나요! 😊");
	}
}
