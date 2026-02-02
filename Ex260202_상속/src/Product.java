
// 모든 상품들의 공통 속성, 기능 정의
public class Product {

	// 접근제한자 : 특정 속성/기능을 어디까지 접근하게 할 건지
	// private : 같은 클래스에서만 접근
	// default(생략) : 같은 패키지에서만 접근
	// protected : 같은 패키지 + 상속 관계에서만 접근 가능
	// public : 어디에서든 접근 가능
	protected String brand;
	protected int price;

	public Product(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public Product() {
	}

	public void powerOn() {
		System.out.println(brand + " 제품의 전원을 켭니다!");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
