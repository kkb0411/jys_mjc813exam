
public class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void eat(Object feed) {
		System.out.println(name + "은 " + feed  + "를 먹는다.");
	}
	public void sleep() {
		System.out.println(name + " 잔다");
	}
	public void move() {
		System.out.println(name + " 이동한다.");
	}
	
	public Animal reproduce(String newName) {
		return new Animal (newName, 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("호랑이", 5);
		animal.eat("고기");
		animal.sleep();
		animal.move();
		
		Animal babyAnimal = animal.reproduce("새끼 호랑이");
		System.out.println("새로운 동물의 이름은: " + babyAnimal.name);
	}

}
