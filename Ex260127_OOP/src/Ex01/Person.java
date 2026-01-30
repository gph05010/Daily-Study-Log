package Ex01;

public class Person {

	// 메인 체크 안 하는 이유
	// -> 메인 - 프로그램의 시작점, 프로그램을 시작하는 역할
	// -> 모든 클래스가 프로그램을 시작할 필요는 없음
	// -> 이 클래스는 객체를 정의하는 설계도 => 사람의 속성(필드), 기능(메서드)를 정의
	// -> 정의를 하는 부분이지, 프로그램을 시작하는 역할이 아님

	// 사람의 설계도 - 나만의 자료형

	// 1. 필드 정의 - 객체의 속성(특성)
	// 키(int), 성별(String), 이름(String), 몸무게(int)
	// 필드 정의 -> 타입 + 필드명;
	int height;
	String gender;
	String name;
	int weight;

	// 2. 메서드 정의 - 객체의 기능(행동, 행위, 로직)
	// 걷다
	public void walk() {
		System.out.println("나는 걸을거야~");
	}

	// static 안 쓰는 이유
	// -> 객체를 new 키워드로 생성함 -> 그래서 객체만의 독립적인 저장 공간이 생김
	// -> static - 클래스가 공통으로 갖는 저장소를 의미
	// -> new - 객체만의 독립된 공간을 만드는 키워드
	// -> 객체로 사용할 메서드나 변수에는 static 사용 X

	// 잔다
	public void sleep() {
		System.out.println("나는 잘거야~");
	}

	// 먹는다
	public void eat() {
		System.out.println("나는 먹을거야~");
	}

}
