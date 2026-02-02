package Test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Dog dog1 = new Dog("바둑이", 3, 2);
		dog1.cry();
		dog1.tailWag();
		dog1.walk();

		Cat cat1 = new Cat("방울이", 2, true);
		cat1.cry();
		cat1.grooming();
		cat1.enterBox();

		ArrayList<Animal> list = new ArrayList<>();
		list.add(dog1);
		list.add(cat1);

		System.out.println("=====동물들을 구경해보세요~=====");

		for (Animal a : list) {
			a.cry();
			if (a instanceof Dog) {
				Dog dog = (Dog) a;
				dog.tailWag();
				dog.walk();
			} else if (a instanceof Cat) {
				Cat cat = (Cat) a;
				cat.grooming();
				cat.enterBox();
			}
		}

	}

}
