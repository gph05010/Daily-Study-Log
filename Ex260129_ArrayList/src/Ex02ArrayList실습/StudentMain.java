package Ex02ArrayList실습;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {

		// 1. Student 자료형을 보관할 수 있는 sList 라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();

		// 2. 데이터 추가(나의 이름, 나이를 가지고 있는 데이터를 추가)
		// -> Student 라는 객체가 필요
		// -> 객체를 생성해서 list에 넣겠다!
		Student s1 = new Student("홍길동", 20);
		sList.add(s1);

		// 추가하는 다른 방법!
		sList.add(new Student("김철수", 20));

		// 3. 이름 출력!
		// System.out.println(sList.get(0).getName());
		// 본질적으로 어떤 자료형인지 확인 필요!
		// sList.get(0) --> return type : Student -> 객체

		// 4. 팀원 데이터 전부 추가
		Student s2 = new Student("김영희", 20);
		Student s3 = new Student("이영희", 20);
		sList.add(s2);
		sList.add(s3);

		// 5. 팀원 이름, 나이 전부 출력! -> for-each문
		System.out.println("===== 팀원 정보 =====");
		for (Student s : sList) {
			System.out.println(s.getName() + "\t" + s.getAge());
		}

	}

}
