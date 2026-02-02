package model;

import java.util.ArrayList;
import java.util.HashMap;

// DTO (Data Transfer Object)
public class Kiosk {

	// 버거 정보들을 저장할 메뉴 리스트
	ArrayList<Burger> menu = new ArrayList<>();
	ArrayList<Burger> orderList = new ArrayList<>();

	// 키오스크 초기화 => 생성자(Constructor)
	public Kiosk() {
		menu.add(new Burger("치즈버거", 5000));
		menu.add(new Burger("불고기버거", 6000));
	}

	// 메뉴 리턴
	public ArrayList<Burger> getMenu() {
		return menu;
	}

	// 주문 추가

	public void addOrder(int orderMenu) {
		orderList.add(menu.get(orderMenu - 1));
	}

	// 주문 리스트 리턴
	public HashMap<String, Integer> getOrders() {
		HashMap<String, Integer> countOrder = new HashMap<>();

		for (Burger b : orderList) {
			// put(key, value)

			// getOrDefault(a, b)
			// 만약에 map에 a 키가 있으면 기존의 value 값을 가져온다
			// 없으면 b값을 value로 넣는다
			countOrder.put(b.getName(), countOrder.getOrDefault(b.getName(), 0) + 1);
		}
		return countOrder;
	}

	// 총 금액 확인
	public int getTotalPrice() {
		int total = 0;
		for (Burger b : orderList) {
			total += b.getPrice();
		}
		return total;
	}

	// 주문 목록 삭제하기
	public void pay() {
		orderList.clear();
	}

}
