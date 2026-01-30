package Ex02ArrayList실습;

public class Student {

	// 학생 정보 설계도

	// 1. 필드 정의 - 속성, 특성, 특징 정의
	// 이름, 나이

	private String name;
	private int age;

	// 2. 메서드 정의 - 기능, 행동, 행위, 로직 정의
	// 모든 필드의 값을 초기화시켜주는 생성자 메서드

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 모든 필드의 getter, setter 메서드 만들기

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
