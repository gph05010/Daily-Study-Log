package controller;

import java.util.HashMap;

import model.Kiosk;
import view.KioskView;

public class KioskController {

	KioskView view = new KioskView();
	Kiosk kiosk = new Kiosk();

	// 전체 흐름 제어 메서드
	public void run() {
		while (true) {

			int choice = view.showChoice();

			if (choice == 1) {
				view.showMenu(kiosk.getMenu());

//				for (int i = 0; i < menu.size(); i++) {
//					System.out.println(
//							"[" + (i + 1) + ". " + menu.get(i).getName() + "(" + menu.get(i).getPrice() + "원)]");
//				} for 문을 사용하고, println을 썼더니 매우 복잡한 코드...

			} else if (choice == 2) {
				int orderMenu = view.showOrder();

				// 선택한 메뉴를 주문 리스트에 추가
				// 0 이하 입력 불가, 리스트의 사이즈보다 큰 값은 입력 불가
				if (orderMenu <= 0 || orderMenu > kiosk.getMenu().size()) {
					view.printMessage("번호를 다시 선택하세요.");
				} else {
					kiosk.addOrder(orderMenu);
					view.printMessage("주문 완료");
				}
			} else if (choice == 3) {

				HashMap<String, Integer> countOrder = kiosk.getOrders();

				view.showOrderList(countOrder);

//				int num = 1;
//				for (Burger b : orderList) {
//					System.out.printf("[%d. %s]\n", num++, b.getName());
//				}
				// 리스트의 내용을 확인, 개수 카운트 변수 선언, 같은 걸 찾으면 그 변수를 증가시키기
				// 메뉴 이름을 가져와, 중복 없이 저장하는 리스트 만들기
//				ArrayList<Burger> orderList2 = new ArrayList<>();
//
//				for (int i = 0; i < orderList.size(); i++) {
//					boolean isFind = false;
//					for (int j = 0; j < orderList2.size(); j++) {
//
//						if (orderList.get(i).getName().equals(orderList2.get(j).getName()))
//						// 주문 목록에 있는 메뉴 이름이 메뉴 이름 저장 리스트에 저장된 것과 같으면
//						{
//							isFind = true;
//							break;
//						}
//
//					}
//					if (!isFind) {
//						orderList2.add(orderList.get(i));
//					}
//
//				}
//				int num = 1;
//				for (int i = 0; i < orderList2.size(); i++) {
//					int count = 0;
//					for (int j = 0; j < orderList.size(); j++) {
//						if (orderList.get(j).getName().equals(orderList2.get(i).getName())) {
//							count++;
//						}
//					}
//					System.out.printf("[%d. %s %d개]\n", num++, orderList2.get(i).getName(), count);
//				}

				// HashMap
				// Key는 중복될 수 없음!
				// put("a", 10);
				// put("a", 20);
				// => get("a") => 20 // 더해지지 않고 덮어씌워짐

			} else if (choice == 4) {
				int total = kiosk.getTotalPrice();
				view.showTotalPrice(total);
			} else if (choice == 5) {
				view.showPay();
				kiosk.pay();
				view.printMessage("결제 완료");
			} else if (choice == 0) {
				view.printMessage("키오스크 전원 off");
				break;
			}
		}
	}

}
