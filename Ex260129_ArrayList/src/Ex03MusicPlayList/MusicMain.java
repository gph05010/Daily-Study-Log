package Ex03MusicPlayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) {

		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		// 2. Music 자료형을 저장할 수 있는 ArrayList 생성(list 이름으로)
		ArrayList<Music> list = new ArrayList<Music>();

		// [1] 노래 추가 [2] 노래 정보 보기 [3] 노래 삭제

		System.out.println("===== Music List =====");

		// Music 프로그램을 6번 종료 누를 때까지 반복
		// 6번 종료 누르면 종료 -> 종료 시점을 모르기 때문에 while문
		while (true) {
			System.out.println("[1]노래 추가 [2]노래 정보 보기 [3]노래 삭제 [4]노래 전체 삭제 [5]전체 노래 정보 보기 [6]종료");
			System.out.print(">> ");
			// 번호 입력 받기
			int inputNum = sc.nextInt();
			sc.nextLine();

			if (inputNum == 1) { // 1번 선택했을 때
				System.out.println("===== 노래 추가 =====");
				// 제목, 가수, 장르 입력받기

				System.out.print("제목 입력 : ");
				String inputTitle = sc.nextLine();
				System.out.print("가수 입력 : ");
				String inputSinger = sc.nextLine();
				System.out.print("장르 입력 : ");
				String inputGenre = sc.nextLine();
				System.out.print("재생시간 입력 : ");
				int inputTime = sc.nextInt();
				sc.nextLine();
				Music m = new Music(inputTitle, inputSinger, inputGenre, inputTime);

				// Music 데이터를 ArrayList 안에 추가

				list.add(m);

				// "노래 추가가 완료되었습니다." 출력

				System.out.println("노래 추가가 완료되었습니다.");

			} else if (inputNum == 2) { // 2번 선택했을 때
				System.out.println("===== 노래 정보 보기 =====");
				// 노래 제목 입력 받기

				System.out.print("노래 제목을 입력하세요 >> ");
				String inputTitle = sc.nextLine();

				boolean isFind = false;

				// ArrayList 안에 들어있는 데이터 중에 일치하는 데이터 찾기
				// 일치하는 데이터가 있다면 제목, 가수, 장르 정보 출력
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getTitle().equals(inputTitle)) {
						isFind = true;
						System.out.println("제목 : " + list.get(i).getTitle());
						System.out.println("가수 : " + list.get(i).getSinger());
						System.out.println("장르 : " + list.get(i).getGenre());
						System.out.println("재생시간 : " + list.get(i).getTime());
						break;
					}
				}

				// 만약에 일치하는 데이터가 없다면
				// 해당하는 노래는 존재하지 않습니다. 출력
				if (!isFind) {
					System.out.println("해당하는 노래는 존재하지 않습니다.");
				}

			} else if (inputNum == 3) { // 3번 선택했을 때
				System.out.println("===== 노래 삭제 =====");
				// 몇 번째 노래를 삭제할 건지 입력받기
				System.out.print("몇 번째 노래를 삭제하시겠습니까? ");
				int inputremove = sc.nextInt();
				sc.nextLine();

				// 사용자 입력은 1번부터 -> 하지만 실제 인덱스는 0부터 (-1)
				if (inputremove >= 1 && inputremove <= list.size()) {
					list.remove(inputremove - 1);
					// 몇 번째 노래가 삭제되었다고 출력
					System.out.println(inputremove + "번째 노래가 삭제되었습니다.");
				} else {
					System.out.println("노래가 등록되어 있지 않은 번호입니다.");
				}

			} else if (inputNum == 4) { // 4번 선택했을 떄
				System.out.println("===== 노래 전체 삭제 =====");
				list.clear();
				System.out.println("노래가 전체 삭제되었습니다.");
			} else if (inputNum == 5) { // 5번 선택했을 때
				System.out.println("===== 노래 전체 정보 보기 =====");
				System.out.println("제목\t가수\t장르\t재생시간");
				for (int i = 0; i < list.size(); i++) {
//					System.out.println(i + 1 + "번째 노래 정보");
//					System.out.println("제목 : " + list.get(i).getTitle());
//					System.out.println("가수 : " + list.get(i).getSinger());
//					System.out.println("장르 : " + list.get(i).getGenre());
//					System.out.println("재생시간 : " + list.get(i).getTime());
					System.out.println(list.get(i).getTitle() + "\t" + list.get(i).getSinger() + "\t"
							+ list.get(i).getGenre() + "\t" + list.get(i).getTime());
				}
			} else { // 6번 선택했을 때, 그 외 선택했을 때
				System.out.println("===== 프로그램 종료 =====");
				break;
			}
		}

	}

}
