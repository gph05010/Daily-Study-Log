package Ex02이차원배열;

public class Ex02예제 {

	public static void main(String[] args) {

		// 1. 5행 5열의 2차원 배열 선언
		int[][] array = new int[5][5];

		int num = 1; // 시작하는 숫자 1로 설정

		// 2. 0부터 배열의 행의 크기만큼 반복
		// 1부터 25까지의 숫자를 순차적으로 저장하고 출력
		for (int i = 0; i < array.length; i++) {
			// 0부터 배열의 열의 크기만큼 반복
			for (int j = 0; j < array[i].length; j++) {
				// 배열에 순차적으로 저장
				// 초기 숫자 설정 필요!
				array[i][j] = num++;

				// 저장된 값 출력!
				System.out.print(array[i][j] + "\t");
			} // 작은 for문 끝
			System.out.println(); // 한 행이 끝나면 개행
		}

	}
}
