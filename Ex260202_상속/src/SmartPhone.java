
public class SmartPhone extends Product { // extends : 상속. 물려받는다

	// 브랜드, 가격, 전화번호
	private String phoneNumber;

	// this -> 현재 자기 자신(객체)
	public SmartPhone(String phoneNumber, String brand, int price) {

		// super(); -> 생략

		this.phoneNumber = phoneNumber;
		// this로는 스마트폰 객체(자식 객체)에만 접근 가능

		// 부모 객체의 brand, price의 접근제한자를 protected로 풀어줌으로써
		// this를 사용해서 부모 객체 속성을 참조할 수 있게 됨
		this.brand = brand;
		this.price = price;
	}

	// 주석 : 프로그램에는 영향을 미치지 않는 설명글
	// @~ : 어노테이션(Annotation) -> 주석
	// Override(오버라이드) : 부모 기능을 재정의 (반환타입, 매개변수는 변경 불가능 / 바디만 변경)
	// @Override : 이 메서드는 오버라이드하는 메서드이니 부모 기능이 맞는지 확인을 부탁하는 기능 -> 컴파일러
	@Override
	public void powerOn() {

		super.powerOn(); // 부모의 powerOn() 메서드 호출 ~> 부모 기능을 그대로 사용하겠다!
		System.out.println("스마트폰 켜짐");
	}

	// Overloading(오버로딩)
	// : 같은 이름의 메서드를 여러 개 정의하는 것, 반환 타입은 같아야 함
	// 매개변수의 타입, 개수, 순서 등을 다르게 하는 것

	// 전원 켜기, 전화 걸기, getter, setter

	public void call() {
		System.out.println(phoneNumber + " 번호로 전화를 겁니다!");
	}

	// alt + shift + s => Generate getters and setters ...

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
