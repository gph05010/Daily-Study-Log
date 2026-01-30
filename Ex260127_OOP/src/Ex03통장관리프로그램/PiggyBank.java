package Ex03통장관리프로그램;

public class PiggyBank {

	// 저금통 설계도

	// 1. 필드 정의
	// 잔액 - money -> 정보 은닉

	// 2. 메서드 정의
	// 입금하다 (deposit)
	// return type 없음, 매개변수로 정수형 하나 받아오기
	// 로직 - 매개변수로 받아온 데이터를 잔액에 누적시켜서 더해주기

	// 출금하다 (withdraw)
	// return type 없음, 매개변수로 정수형 하나 받아오기
	// 로직 - 매개변수로 받아온 데이터를 잔액에 빼주기

	// 잔액확인 (showMoney)
	// return type 있음, int로 리턴
	// 매개변수 없음, 현재 잔액만 리턴

	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void deposit(int money) {
		this.money += money;
		// this -> 현재 클래스 자체를 의미하는 키워드
	}

	public void withdraw(int money) {
		this.money -= money;
	}

	public int showMoney() {
		return money;
	}

}
