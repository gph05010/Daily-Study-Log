package Ex06객체배열;

public class Main {

	public static void main(String[] args) {

		// 1. 객체 배열 생성
		// 자료형[] 배열명 = new 자료형[배열의크기];

		// 포켓몬 자료형을 3개 보관할 수 있는 bag 배열 생성
		Pokemon[] bag = new Pokemon[3];

		// 객체 배열의 0번 인덱스에 들어있는 데이터 출력
		System.out.println("bag의 0번방 출력 : " + bag[0]);

		// 객체 배열의 0번 인덱스에 포켓몬 1마리 넣어보자!
		// 이름 : 이상해씨 / 타입 : 풀 / 스킬 : 넝쿨채찍 / hp : 100 / atk : 20
		bag[0] = new Pokemon("이상해씨", "넝쿨채찍", 100, 20, "풀");

		System.out.println("bag의 0번 인덱스 출력 : " + bag[0]);
		System.out.println("bag의 0번 인덱스의 포켓몬 이름 : " + bag[0].getName());

		// bag 배열의 1번, 2번 인덱스에도 포켓몬 넣어보자!
		bag[1] = new Pokemon("꼬부기", "물대포", 120, 15, "물");
		bag[2] = new Pokemon("파이리", "불꽃세례", 80, 30, "불");

//		System.out.println("bag의 1번 인덱스의 포켓몬 이름 : " + bag[1].getName());
//		System.out.println("bag의 0번 인덱스의 포켓몬 이름 : " + bag[2].getName());

		// 배열 안에 들어있는 포켓몬의 이름, 타입, 스킬 전부 출력!
		// ===== 포켓몬 정보 출력 =====
		// 이름 타입 스킬
		// 이상해씨 풀 넝쿨채찍
		// 꼬부기 물 물대포
		// 피카츄 전기 백만볼트

		System.out.println("===== 포켓몬 정보 출력 =====");
		System.out.println("이름\t타입\t스킬");
		for (int i = 0; i < bag.length; i++) {
			System.out.println(bag[i].getName() + "\t" + bag[i].getType() + "\t" + bag[i].getSkill());
		}

		System.out.println();

		// for-each문
		// : 배열과 같이 여러 개의 데이터를 저장하는 자료구조와 함께 사용
		System.out.println("===== 포켓몬 정보 출력 =====");
		System.out.println("이름\t타입\t스킬");
		// ** 동작원리
		// 배열 안에 저장되어 있는 데이터를 for문에서 순차적으로 꺼내서
		// :(콜론) 기준 왼쪽에 있는 변수에 담아주는 흐름을 가짐
		for (Pokemon p : bag) { // 데이터타입 + 변수명 : 반복시키고 싶은 배열의 이름
			System.out.println(p.getName() + "\t" + p.getType() + "\t" + p.getSkill());
		}

	}

}
