package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Burger;

public class KioskView {

	Scanner sc = new Scanner(System.in);

	// 기능 메뉴 출력, 입력
	public int showChoice() {
		System.out.print("1.메뉴보기 2.주문하기 3.주문목록 4.총금액 5.계산 0.종료 ");
		int choice = sc.nextInt();
		return choice;
	}

	// 버거 메뉴 출력
	public void showMenu(ArrayList<Burger> menu) {
//		System.out.println("~~~집게리아 메뉴~~~");
		int num = 1; // for-each 문은 인덱스 값을 가져올 수 없으므로, 카운트를 위한 변수 선언
		for (Burger b : menu) {
			// %d : 정수 / %s : 문자열 / %f : 실수
			System.out.printf("[%d. %s (%d원)]\n", num++, b.getName(), b.getPrice());
			// 개행 필요 시, \n
		}
	}

	// 주문번호 선택
	public int showOrder() {
		// 메뉴 번호 선택(1개만 선택)
		System.out.print("주문할 메뉴 번호를 입력하세요 >> ");
		int orderMenu = sc.nextInt();
		return orderMenu;
	}

	// 메세지 출력
	public void printMessage(String message) {
		System.out.println(message);
	}

	// 주문 리스트 출력
	public void showOrderList(HashMap<String, Integer> countOrder) {
		// HashMap 데이터 출력
		int num = 1;
		for (String key : countOrder.keySet()) {
			System.out.printf("%d. %s (%d개)\n", num++, key, countOrder.get(key));
		}
	}

	// 총 금액 출력
	public void showTotalPrice(int total) {
		System.out.printf("총 금액 : %d원\n", total);
	}

	// 결제 수단 입력받기
	public int showPay() {
		System.out.print("1. 간편결제 2. 카드결제 >> ");
		return sc.nextInt();
	}

}
