package Ex01메서드;

public class Ex06메서드오버로딩 {

	public static void main(String[] args) {

		System.out.println(add(3, 4)); // ctrl + 1
		System.out.println(add(3.0, 4.0));

		// 메서드 오버로딩(=중복정의)
		// : 매개변수의 개수를 다르게 하고, 메서드의 이름(메서드명)을 똑같이 부여해
		// 중복정의하는 기법

		// * 메서드 오버로딩의 성립 조건
		// 1) 메서드명이 같아야 함
		// 2) 매개변수의 개수 또는 자료형(타입)을 다르게 해야 함
		// 3) 매개변수와 이름은 동일한데 리턴 타입이 다른 경우에는 오버로딩이 아님

	}

	private static double add(double d, double e) {
		double result = d + e;
		return result;
	}

	private static int add(int i, int j) {
		int result = i + j;
		return result;
	}

}
//깃허브 잔디 심기 테스트