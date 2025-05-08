package com.shinhan.controller;

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
