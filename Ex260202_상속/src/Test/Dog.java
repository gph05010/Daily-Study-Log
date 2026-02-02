package Test;

public class Dog extends Animal {

	private int walkCount;

	public Dog(String name, int age, int walkCount) {
		super(name, age);
		this.walkCount = walkCount;
	}

	@Override
	public void cry() {
		System.out.println("멍멍!");
	}

	public void tailWag() {
		System.out.println("강아지가 꼬리를 흔들고 있어요!!");
	}

	public void walk() {
		System.out.println("강아지가 신나게 산책을 해요.");
		walkCount++;
	}

	public int getWalkCount() {
		return walkCount;
	}

	public void setWalkCount(int walkCount) {
		this.walkCount = walkCount;
	}

}
