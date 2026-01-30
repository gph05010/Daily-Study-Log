package Ex03통장관리프로그램;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		// 1. PiggyBank 설계도를 기반으로 bank1 객체 생성
		// 클래스명(자료형) 객체명 = new 클래스명();

		PiggyBank bank1 = new PiggyBank();

		// 2. bank1에 잔액을 1000원 추가

		bank1.setMoney(1000);

		// 3. bank1에 7000원을 입금

		bank1.deposit(7000);

		// 4. bank1에 5000원을 출금

		bank1.withdraw(5000);

		// 5. bank1에 잔액 확인

		System.out.println("bank1 잔액 : " + bank1.showMoney() + "원");

		// 입력받아서 해보기

		Scanner sc = new Scanner(System.in);

		// 1. PiggyBank 설계도를 기반으로 bank2 객체 생성
		PiggyBank bank2 = new PiggyBank();

		// 2. 입금할 금액 입력 받기
		System.out.print("입금할 금액 입력 >> ");
		int inputMoney = sc.nextInt();
		bank2.deposit(inputMoney);
		System.out.println("현재 잔액 : " + bank2.showMoney() + "원");

		// 3. 출금할 금액 입력 받기
		System.out.print("출금할 금액 입력 >> ");
		int outputMoney = sc.nextInt();
		bank2.withdraw(outputMoney);
		System.out.println("현재 잔액 : " + bank2.showMoney() + "원");

	}

}
