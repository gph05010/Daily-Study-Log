package Ex01문제;

public class Ex02예제 {

	public static void main(String[] args) {

		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i + " ");
		}
		// 숫자를 문자로 형변환이 가능
		System.out.println();
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		// 문자는 사실 숫자이므로, ++ 연산이 가능
		System.out.println();
		for (char c = 'Z'; c >= 'A'; c--) {
			System.out.print(c + " ");
		}

	}

}
//깃허브 잔디 심기 테스트