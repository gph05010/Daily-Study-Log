package Controller;

import Model.MemberDAO;
import Model.MemberDTO;
import View.MemberView;

public class MemberController {

	// Controller 역할
	// : View에서 입력받은 값으로 Model(DAO)를 호출하고 전체 메뉴를 제어

	// View 객체 생성
	// -> 메뉴 보여주기/입력받기/출력하기 기능을 사용하기 위해서 생성
	MemberView view = new MemberView();

	// DAO 객체 생성
	// -> DB에 회원정보를 저장/조회/수정/삭제하는 기능을 사용하기 위해서 생성
	MemberDAO dao = new MemberDAO();

	// 전체 흐름을 제어하는 메서드
	public void run() {

		// 반복문 -> 6번 종료를 선택하기 전까지 반복 -> while
		while (true) {

			// View에서 사용자의 선택한 번호를 반환
			// 그 값을 choice 변수에 저장
			int choice = view.showChoice();

			if (choice == 1) { // 1번 회원가입
				// View에서 회원가입에 필요한 값(id, pw, name, age)을 입력받고
				// 입력받은 값을 MemberDTO 객체에 담아 반환
				MemberDTO input = view.inputJoin();

				// DAO의 join()을 호출해서 DB에 insert 진행
				int row = dao.join(input.getId(), input.getPw(), input.getName(), input.getAge());
				// input DTO에 들어있는 id, pw, name, age를 꺼내서 전달

				if (row > 0) {
					System.out.println("회원가입 성공~!");
				} else {
					System.out.println("회원가입 실패...");
				}

			} else if (choice == 2) { // 2번 로그인

			} else if (choice == 3) { // 3번 회원탈퇴

			} else if (choice == 4) { // 4번 전체회원조회

			} else if (choice == 5) { // 5번 회원정보수정

			} else if (choice == 6) { // 6번 종료
				System.out.println("프로그램 종료");
				break;
			} else { // 그 외 번호 선택했을 때
				System.out.println("번호를 다시 입력하세요.");
			}
		}

	}

}
