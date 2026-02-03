
public class Lion extends Animal {

	// 추상 클래스를 상속받는 경우에는 그 하위에 정의된 추상 메서드를 반드시 재정의(구체화)해줘야 함 -> 강제성 부여
	// 일반 클래스를 상속받는 경우에는 일반 메서드만 포함하고 있기 때문에 재정의(오버라이딩)하는 것은 선택이지, 강제가 아님
	public Lion(String dietType, String habitat) {
		this.dietType = dietType;
		this.habitat = habitat;
	}

	@Override
	public void move() {
		System.out.println("네 발로 힘차게 달립니다.");
	}

}
