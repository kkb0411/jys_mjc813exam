
public class Bird extends Animal {
	String wings = "날개";
	
	public Bird(String name, int age) {
		super(name, age);
	}
	public void flap() {
		System.out.println(name + " " + wings + " 날개짓한다.");
	}
	public void fly() {
		System.out.println(name + " " + wings + " 난다.");
	}
	@Override
	public Animal reproduce(String newName) {
		return new Bird(newName, 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird("참새",3);
		bird.eat("씨앗");
		bird.sleep();
		bird.move();
		bird.flap();
		bird.fly();
		
		Bird babyBird = (Bird)bird.reproduce("새끼 참새");
		System.out.println("새로운 새의 이름은: " + babyBird.name);
	}

}
