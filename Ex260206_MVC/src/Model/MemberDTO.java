package Model;

public class MemberDTO {

	// DTO
	// : Data Transfer Object
	// 데이터를 이동할 수 있게 하는 나만의 자료형
	// Table 마다 1개씩 생성
	// Table의 컬럼을 가져와서 필드로 만듦

	// 1) 필드 정의
	// id, pw, name, age
	private String id;
	private String pw;
	private String name;
	private int age;

	// 2) 메서드 정의
	// 기본 생성자
	// 모든 필드를 초기화시킬 수 있는 생성자
	// 모든 필드의 getter, setter 메서드

	public MemberDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public MemberDTO() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

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
