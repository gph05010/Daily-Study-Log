package Ex02;

public class Main {

	public static void main(String[] args) {

		// 만들었던 Kakao 프로필 설계도를 기반으로 객체 생성
		// 객체에 접근해서 데이터 넣고 출력

		Kakao k = new Kakao();

//		k.nickname = "평온";
//		k.state = "편안함";
//		k.email = "abc123@abc.com";
//
		// 캡슐화로 객체 필드에 private을 걸어 놨더니 에러가 생김(데이터에 접근 불가)

//		System.out.println(k.nickname + k.state + k.email);

//		k.message("안녕하세요");

		// 캡슐화가 되어 있을 때 값을 수정하는 방법
		k.setNickname("평화");
		k.setState("따뜻함");
		k.setEmail("abc1234@abc.com");
		System.out.println(k.getNickname() + k.getState() + k.getEmail());

	}

}
