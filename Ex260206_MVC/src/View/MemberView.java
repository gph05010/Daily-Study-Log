package View;

import java.util.Scanner;

import Model.MemberDTO;

public class MemberView {

	// 디자인 패턴
	// -> 형식, 규칙을 지정해놓은 패턴

	// MVC 패턴
	// - Model, View, Controller
	// - Model : 데이터를 저장하거나 조작하기 위한 코드의 모음 (DTO, DAO)
	// - View : 사용자에게 직접적으로 보여지는 부분
	// - Controller : 실제 기능이 일어나는 부분

	Scanner sc = new Scanner(System.in);

	// 번호선택하는 입력 메서드

	public int showChoice() {

		System.out.println("===== 회원관리 프로그램 =====");
		System.out.println("[1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원조회 [5]회원정보수정 [6]종료");
		int num = sc.nextInt();

		return num; // -> 사용자가 입력한 번호를 반환
	}

	// 회원가입
	public MemberDTO inputJoin() {
		System.out.println("===== 회원가입 =====");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		// 입력받은 값들을 DTO 객체로 만들어서 반환
		return new MemberDTO(id, pw, name, age);
		// -> Controller에서 DTO에 getId(), getPw()로 값을 꺼내서 DAO에 전달
	}

}
