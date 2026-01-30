package Ex01;

public class Main {

	public static void main(String[] args) {

		// 메인 클래스 - 객체를 생성하는 곳!

		// 1. 객체 생성 - 우리가 만들었던 Person이라고 하는 설계도를 기반으로
		Person p = new Person();
		// -> 클래스명(자료형) 객체명 = new 클래스명();

		p.name = "홍길동";
		System.out.println(p.name);
		// 키, 성별, 몸무게
		p.height = 180;
		p.gender = "남자";
		p.weight = 70;
		System.out.println("키 : " + p.height + ", 성별 : " + p.gender + ", 몸무게 : " + p.weight);

		p.eat();

		// 내가 같은 사람의 객체를 만들 거라면
		// 기존에 있던 사람 설계도를 가지고 객체만 생성
		// -> 하나의 클래스로 여러 개의 객체를 생성!

		// 우리가 만들었던 Person 클래스를 기반으로 p2 객체 생성
		// -> 내 짝꿍 데이터 넣어보기~! / 출력까지~

		Person p2 = new Person();
		p2.name = "김철수";
		p2.height = 170;
		p2.gender = "남자";
		p2.weight = 60;
		System.out.println(p2.name + p2.height + p2.gender + p2.weight);

		p2.walk();

	}

}
