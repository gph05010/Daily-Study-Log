package Ex01문제;

import java.util.Random;
import java.util.Scanner;

public class Ex05예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int num1, num2, answer, failCount = 0;

		while (true) {
			num1 = rd.nextInt(10) + 1;
			num2 = rd.nextInt(10) + 1;
			System.out.print(num1 + " + " + num2 + " = ");
			answer = sc.nextInt();
			if (answer == num1 + num2) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				failCount++;
				if (failCount >= 5) {
					System.out.println("GAME OVER!");
					break;
				}
			}
		}

	}

}
//깃허브 잔디 심기 테스트