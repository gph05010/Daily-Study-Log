package Ex02이차원배열;

public class Ex04예제 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 21;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num++;
			}
		}
		for (int j = 0; j < array[0].length; j++) {
			// 배열이 직사각형이 아닌 경우까지 코드가 작동하게 하려면,
			// j(열)에 열의 길이를 넣어야 한다.
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
