package Ex01메서드;

import java.util.Scanner;

public class Ex04예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

	}

	public static int close10(int num1, int num2) {
		int diff1 = num1 > 10 ? num1 - 10 : 10 - num1;
		int diff2;
//		if (num1 > 10) {
//			diff1 = num1 - 10;
//		} else {
//			diff1 = 10 - num1;
//		}
		if (num2 > 10) {
			diff2 = num2 - 10;
		} else {
			diff2 = 10 - num2;
		}
		if (diff1 > diff2) {
			return num2;
		} else if (diff2 > diff1) {
			return num1;
		} else {
			return 0;
		}
		// return (diff1 == diff2) ? 0 : ((diff1 > diff2) ? num2 : num1);

	}

}
//깃허브 잔디 심기 테스트