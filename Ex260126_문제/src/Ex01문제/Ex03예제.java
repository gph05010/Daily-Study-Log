package Ex01문제;

import java.util.Scanner;

public class Ex03예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);

	}

	public static boolean isDivide(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
//깃허브 잔디 심기 테스트