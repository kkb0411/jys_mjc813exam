
public class Parrot extends Bird {
	public Parrot(String name, int age) {
		super(name, age);
	}
	@Override
	public void fly() {
		System.out.println(name + " " + wings + "조금만 난다.");
	}
	@Override
	public void eat(Object feed) {
		if(feed instanceof String) {
			System.out.println(name + "은 " + feed + "를 먹는다.");
		}else {
			System.out.println(name + " 은 먹이를 먹지 않는다.");
		}
	}
	@Override
	public Bird reproduce(String newName) {
		Parrot babyParrot = new Parrot(newName, 0);
		return babyParrot;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot parrot = new Parrot("짹짹이",2);
		parrot.eat("해바라기씨");
		parrot.fly();
		parrot.sleep();
		
		Parrot baby = (Parrot)parrot.reproduce("작은짹짹이");
		baby.fly();
	
	}

}
