package Ex01문제;

import java.util.Scanner;

public class Ex04예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int n = sc.nextInt();

		int[][] array = new int[n][n];

		int num = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					array[i][j] = num++;
				} else {
					array[i][n - j - 1] = num++;
				}
			}
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
//깃허브 잔디 심기 테스트