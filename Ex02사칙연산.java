package Ex01메서드;

public class Ex02사칙연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(3, 5));
		System.out.println(sub(3, 5));
		System.out.println(mul(3, 5));
		System.out.println(div(3, 5));

	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

}