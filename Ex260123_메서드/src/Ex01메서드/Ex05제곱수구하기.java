package Ex01메서드;

import java.util.Scanner;

public class Ex05제곱수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("밑 입력 : ");
		int base = sc.nextInt();
		System.out.print("지수 입력 : ");
		int n = sc.nextInt();
		int result = powerN(base, n);
		System.out.println("결과확인 : " + result);

	}

	public static int powerN(int base, int n) {

		int result = 1;

		for (int i = 0; i < n; i++) {
			result *= base;
		}

		return result;
	}

}
//깃허브 잔디 심기 테스트