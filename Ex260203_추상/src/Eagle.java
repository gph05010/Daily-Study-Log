
public class Eagle extends Animal {

	public Eagle(String dietType, String habitat) {
		this.dietType = dietType;
		this.habitat = habitat;
	}

	@Override
	public void move() {
		System.out.println("날개를 펼쳐 높이 비행합니다.");
	}

}
