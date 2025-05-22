
public class Eagle extends Bird {
	public Eagle(String name, int age) {
		super(name, age);
	}
	@Override
	public void fly() {
		System.out.println(name + " " + wings + " 높이 난다.");
	}
	@Override
	public void eat(Object feed) {
		if(feed instanceof Animal) {
			Animal prey = (Animal)feed;
			System.out.println(name + "은 " + prey.name + "를 먹는다.");
		}else {
			System.out.println(name + "은 동물만 먹을 수 있다.");
		}
	}
	@Override
	public Bird reproduce(String newName) {
		return new Eagle(newName, 0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle eagle = new Eagle("독수리", 5);
		eagle.fly();
		
		Animal rabbit = new Animal("토끼", 1);
		eagle.eat(rabbit);
		eagle.eat("씨앗");
		Eagle babyEagle = (Eagle)eagle.reproduce("아기독수리");
		babyEagle.fly();
	}

}
