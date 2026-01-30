package Ex01ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList
		// : 크기가 가변적인 배열과 같은 형태를 가진 **클래스**

		// <> : 제네릭 기법
		// -> 어떤 데이터를 보관할지 아직 모름
		// <> 적는 순간 어떤 데이터를 저장할지 지정

		// 1. ArrayList 생성
		// : 레퍼런스 타입의 데이터만 저장할 수 있음
		// ex) String, Pokemon, Student (만든 설계도/클래스)
		ArrayList<String> list = new ArrayList<String>();

		// 2. 데이터 추가
		list.add("홍길동");
		list.add("김철수");

		// 3. 데이터 가져오기
		list.get(0);
		System.out.println(list.get(0));

		// 4. 데이터를 특정 위치에 추가
		list.add(0, "이영희");

		System.out.println(list.get(0));

		// 5. 데이터 삭제
		list.remove(0);
		System.out.println(list.get(0));

		// 6. 데이터 크기 알아보기
		list.size();
		System.out.println("리스트의 크기 : " + list.size());

		// 7. 데이터 전체 삭제
		list.clear();
		System.out.println("clear 사용 후 리스트의 크기 : " + list.size());

	}

}
