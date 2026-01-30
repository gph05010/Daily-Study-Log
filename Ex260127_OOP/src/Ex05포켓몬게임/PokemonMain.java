package Ex05포켓몬게임;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {

		// 게임 실행 공간

		Scanner sc = new Scanner(System.in);

		// 1. 포켓몬 2마리 객체 생성 -> 값을 초기화하면서 생성
		// 이름 - 이상해씨, 타입 - 풀, 스킬 - 넝쿨채찍, hp - 100, atk - 20
		// 초기화시킬 때는 매개변수의 순서대로 값을 넣어야 함

		Pokemon poke1 = new Pokemon("피카츄", "10만볼트", 100, 20, "전기");
		Pokemon poke2 = new Pokemon("나옹", "할퀴기", 150, 10, "노말");

		// 2. 사용자가 입력한 값을 구분
		// 2-1. 입력 도구 꺼내오기 (맨 위로)
		// 2-2. 한 마리의 포켓몬이 죽을 때까지 -> 언제 죽을지 모름 -> while
		while (true) {
			System.out.println("===== 포켓몬 선택하기 =====");
			System.out.print("[1]피카츄 [2]나옹 >> ");
			// 입력받은 값 변수에 저장 -> 번호로 선택
			int pokenum = sc.nextInt();

			boolean isAction = false;

			if (pokenum == 1) { // 1번 선택했을 때 (피카츄)
				while (true) {
					System.out.println("===== 포켓몬 공격 패턴 선택 =====");
					System.out.print("[1]일반공격 [2]스킬공격 >> ");
					// 입력받은 값 변수에 저장 -> 번호로 선택
					int skillnum = sc.nextInt();

					if (skillnum == 1) { // 1번 일반공격 선택했을 때
						// 나옹 hp = 나옹 hp - 피카츄 atk
						poke2.setHp(poke2.getHp() - poke1.getAtk());
						isAction = true;
						break;
					} else if (skillnum == 2) { // 2번 스킬공격 선택했을 때
						poke2.setHp(poke2.getHp() - (int) (poke1.getAtk() * 1.5));
						isAction = true;
						break;
					} else { // 잘못 입력했을 때, 다시 입력하라고 하기
						System.out.println("잘못 입력하셨습니다. 1 또는 2를 입력해 주세요.");
					}
				}
			} else if (pokenum == 2) { // 2번 선택했을 때 (나옹)
				while (true) {
					System.out.println("===== 포켓몬 공격 패턴 선택 =====");
					System.out.print("[1]일반공격 [2]스킬공격 >> ");
					int skillnum = sc.nextInt();

					if (skillnum == 1) { // 1번 일반공격 선택했을 때
						poke1.setHp(poke1.getHp() - poke2.getAtk());
						isAction = true;
						break;
					} else if (skillnum == 2) { // 2번 스킬공격 선택했을 때
						poke1.setHp(poke1.getHp() - (int) (poke2.getAtk() * 1.5));
						isAction = true;
						break;
					} else { // 잘못 입력했을 때, 다시 입력하라고 하기
						System.out.println("잘못 입력하셨습니다. 1 또는 2를 입력해 주세요.");
					}
				}

			} else { // 잘못 입력했을 때, 다시 입력하라고 하기
				System.out.println("잘못 입력하셨습니다. 1 또는 2를 입력해 주세요.");

			}

			// 두 마리의 포켓몬 hp 확인용 출력
			if (isAction == true) {
				System.out.println("피카츄 hp : " + poke1.getHp());
				System.out.println("나옹 hp : " + poke2.getHp());
			}

			// 게임 종료 조건
			// -> 포켓몬 두 마리 중 한 마리라도 hp가 0보다 작거나 같으면
			// 게임 종료 출력하고 프로그램 종료
			if (poke1.getHp() <= 0 || poke2.getHp() <= 0) {
				System.out.println("게임 종료");
				break;
			}
		}

	}

}
