import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

//		SmartPhone phone1 = new SmartPhone();
//		phone1.setPhoneNumber("010-0000-0000");
//		phone1.setBrand("SAMSUNG");
//		phone1.setPrice(1000000);

		SmartPhone phone1 = new SmartPhone("010-0000-0000", "SAMSUNG", 1000000);
		phone1.call();
		phone1.powerOn();

		WashingMachine wMachine = new WashingMachine(20, "LG", 800000);
		wMachine.startWash();
		wMachine.powerOn();

		// -> 배열(array), 어레이리스트(ArrayList) => 여러 개의 값을 순차적으로 보관할 수 있는 자료구조
		// "같은 자료형의 데이터만" 같이 저장할 수 있음

		ArrayList<Product> list = new ArrayList<>(); // <> 안에 부모 넣어줬다!
		// 스마트폰, 세탁기를 둘 다 넣어야 하는데, 어레이리스트는 같은 자료형의 데이터만 저장할 수 있기 때문에, 공통점인 부모를 넣어 주었다.

		// (int)3.14; 강제(명시적) 형변환

		// Casting => 형변환
		// 업캐스팅(UpCasting) : 부모 타입으로 형변환되는 것 (자동 형변환)
		Product product = new SmartPhone("010-1111-1111", "APPLE", 1500000);
		// => 업캐스팅이 되면 같은 부모를 가진 객체끼리 배열/리스트에 같이 저장할 수 있음
		// => 업캐스팅이 되더라도 본 객체에서 재정의한 메서드가 있으면 그 메서드로 호출됨
		// => 업캐스팅된 상태에서는 자식 객체에서만 정의된 메서드는 호출할 수 없음 (변수는 부모타입이기 때문!)

		list.add(phone1); // new SmartPhone("010-0000-0000", "SAMSUNG", 1000000);
		// 리스트에 저장할 때, 업캐스팅이 자동으로 이루어짐
		list.add(wMachine); // new WashingMachine(20, "LG", 800000);

		Product[] array = new Product[2];
		array[0] = phone1;
		array[1] = wMachine;

		// 모든 클래스는 최상위 부모로 Object를 가짐!
		// 1. 모든 객체가 가져야 하는 공통적인 속성/기능 정의
		// 2. Object 타입으로 업캐스팅하여 모든 객체를 하나의 배열/리스트에서 관리할 수 있도록 해줌!
		Random rd = new Random();
		Object[] arr = new Object[2];
		arr[0] = phone1;
		arr[1] = rd;

		System.out.println("====================");

		for (Product p : list) {
			p.powerOn(); // 자식 객체에서 오버라이드된 기능은 그 기능을 호출

			// SmartPhone일 경우 -> call() 를 호출
			// WashingMachine일 경우 -> startWash()를 호출
			// p 객체가 원래 어떤 자식이었는지 확인 필요 => instanceof(true/false)

			if (p instanceof SmartPhone) { // 원래 SmartPhone 타입 객체였을 때

				// 다운캐스팅 : 업캐스팅(부모 타입)이 된 상태에서 원래 타입(자식 타입)으로 변환하는 것
				SmartPhone phone = (SmartPhone) p; // -> 다운캐스팅, 강제 형변환
				// 업캐스팅은 자동으로 해줌(부모에게 자식을 넣기), 다운캐스팅은 수동으로 해주기(자식에게 부모를 넣기).
				// 개발자가 컴파일러에게 보증해주는 느낌. (이 부모 타입 데이터는 자식 타입 맞아!)
				phone.call();

			} else if (p instanceof WashingMachine) { // 원래 WashingMachine 타입 객체였을 때

				WashingMachine machine = (WashingMachine) p;
				machine.startWash();

			}

		}

	}

}
