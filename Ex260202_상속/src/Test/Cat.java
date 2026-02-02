package Test;

public class Cat extends Animal {

	private boolean isBoxLover;

	public Cat(String name, int age, boolean isBoxLover) {
		this.name = name;
		this.age = age;
		this.isBoxLover = isBoxLover;

	}

	@Override
	public void cry() {

		System.out.println("야옹~");
	}

	public void grooming() {
		System.out.println("고양이가 털을 핥고 있어요~");
	}

	public void enterBox() {
		if (isBoxLover) {
			System.out.println("고양이가 박스를 좋아해요!");
		} else {
			System.out.println("고양이가 박스를 발로 툭 차버리네요. 싫은가 봐요...");
		}
	}

	public boolean isBoxLover() {
		return isBoxLover;
	}

	public void setBoxLover(boolean isBoxLover) {
		this.isBoxLover = isBoxLover;
	}

}
