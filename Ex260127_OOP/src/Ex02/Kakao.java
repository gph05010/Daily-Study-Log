package Ex02;

public class Kakao {

	// 카카오톡 프로필 설계도

	// 1. 필드 정의 - 객체 속성 정의
	// 닉네임(String), 상태메세지(String), email(String)

	// 2. 메서드 정의 - 객체 기능 정의
	// 메세지 기능
	// -> 매개변수로 메세지를 전달받아 출력하기
	// ex) "안녕~!" (매개변수) + "라고 메세지를 보냈습니다."
	// => 안녕~! 이라고 메세지를 보냈습니다.

	private String nickname;
	private String state;
	private String email;

	public void message(String text) {
		System.out.println(text + " (이)라고 메세지를 보냈습니다.");
	}

	// 필드에 private으로 접근을 제한했기 때문에 수정, 가져오기 기능 추가
	// nickname, state -> 수정/보기
	// email -> 보기
	// => setter, getter 메서드 사용 => 단축키 alt+shift+s
	// setter -> 정보를 수정할 수 있는 기능
	// getter -> 정보를 가져오는 기능
	// => 클래스 내부에 있는 필드 값을 외부(다른 클래스)에서 수정 또는 반환할 수 있도록 하는 메서드

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}
