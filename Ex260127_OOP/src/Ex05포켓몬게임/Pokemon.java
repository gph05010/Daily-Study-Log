package Ex05포켓몬게임;

public class Pokemon {

	// 포켓몬 설계도

	// 1. 필드 정의
	// 이름, 스킬, hp, atk, 타입 (private 처리)

	private String name;
	private String skill;
	private int hp;
	private int atk;
	private String type;

	// 2. 메서드 정의
	// 모든 필드의 값을 초기화시킬 수 있는 생성자 메서드
	public Pokemon(String name, String skill, int hp, int atk, String type) {
//		super();
		this.name = name;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
		this.type = type;
	}

	public Pokemon() {
	}

	// 모든 필드의 getter, setter 메서드 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
