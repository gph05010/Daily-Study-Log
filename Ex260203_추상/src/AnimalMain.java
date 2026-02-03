
public class AnimalMain {

	public static void main(String[] args) {

		// new Animal(); 추상 클래스로는 객체 생성 불가능

		Lion lion1 = new Lion("육식", "육지");
		Animal lion2 = new Lion("육식", "육지");
		Animal eagle1 = new Eagle("육식", "하늘");

		Animal[] animals = new Animal[2];
		animals[0] = lion2;
		animals[1] = eagle1;

		for (Animal a : animals) {
			a.printInfo();
			a.move();
		}

	}

}
