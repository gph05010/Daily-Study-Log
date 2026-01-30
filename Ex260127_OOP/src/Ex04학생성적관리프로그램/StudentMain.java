package Ex04학생성적관리프로그램;

public class StudentMain {

	public static void main(String[] args) {

		Student stu1 = new Student();

		stu1.setName("홍길동");
		stu1.setNumber("20250401");
		stu1.setAge(20);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);
		// 초기화 이후, 값을 바꾸고 싶을 때 setter 쓰기

		// 값을 초기화시키면서 객체 생성

		Student stu2 = new Student("김철수", "20250402", 20, 90, 25, 50);
		System.out.println(stu2.getName());

	}

}
