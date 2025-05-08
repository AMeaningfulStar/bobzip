package com.shinhan.controller;

import java.util.Scanner;

public class FrontController {
	static Scanner input = new Scanner(System.in);
	static boolean user = false;

	public static void main(String[] args) {
		boolean isServiceOff = false;

		while (!isServiceOff) {
			user = startServiceFlow();

			if (user == false) {
				break;
			} else {
			}
		}

		input.close();
		Display.displayExit();
	}

	private static boolean startServiceFlow() {
		while (true) {
			Display.displayStart();
			int startInput = input.nextInt();
			input.nextLine();

			switch (startInput) {
			case 1 -> {
				return true;
			}
			case 2 -> {
				return true;
			}
			case 3 -> {
				return false;
			}
			default -> {
				Display.displayError("메뉴에 있는 번호 중 하나를 선택해주세요.");
				continue;
			}
			}
		}
	}

}
