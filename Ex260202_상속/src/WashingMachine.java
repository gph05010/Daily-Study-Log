
public class WashingMachine extends Product {

	// 브랜드, 가격, 용량

	private int capacity;

	public WashingMachine(int capacity, String brand, int price) {
		// 부모객체 생성자 호출
		// super() -> 부모 객체의 기본 생성자 호출 -> 생략가능
		super(brand, price);
		this.capacity = capacity;
	}

	// 전원 켜기, 세탁하기
	public void startWash() {
		System.out.println("세탁을 시작합니다!");
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
