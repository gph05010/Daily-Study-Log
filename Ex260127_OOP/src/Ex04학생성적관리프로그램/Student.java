package Ex04학생성적관리프로그램;

public class Student {

	// 학생 성적 관리 설계도

	// 1. 필드 정의
	private String name; // 이름
	private String number; // 학번
	private int age; // 나이
	private int scoreJava; // Java 점수
	private int scoreWeb; // Web 점수
	private int scoreAndroid; // Android 점수

	// 모든 필드의 값을 초기화시킬 수 있는 메서드
	// -> 생성자 메서드

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		// super(); -> 상속 때 배울 예정!
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public Student() {

	} // => 자바의 기본 생성자. 생성자 메서드를 만들지 않을 때는, 자바가 기본으로 이것을 생성해 둔다.
		// => 그래서 Student stu1 = new Student(); 이게 가능한 것인데,
		// => 생성자 메서드를 만들었다면 그에 맞는 초기화 값을 넣어주어야 함.

	// ** 생성자 메서드(constructor)
	// -> 객체를 생성하는 순간에 실행되는 메서드
	// -> 필드에 있는 데이터를 객체를 생성하는 순간에 초기화시켜줄 수 있도록 로직 작성 가능
	// ** 특징
	// 1) 리턴 타입을 지정조차 하지 않음 (void 처리도 안함)
	// 2) 생성자 이름은 클래스 이름과 동일 (대소문자까지)
	// 3) 생성자도 결국 메서드
	// 4) 매개변수가 아무것도 없는 빈 생성자를 기본 생성자 (자바에서는 기본생성자 생략되어 있음)
	// 단, 새로운 생성자를 만들게 되면 기본 생성자는 사라짐 (필요하면 직접 만들어야 함)
	// 5) 생성자도 오버로딩(중복정의) 가능

	// 2. 메서드 정의
	// 모든 필드의 getter, setter 메서드 만들기
	// 단축키 : alt + shift + s
	// 마우스 우클릭 -> source -> getter and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

}
