
public class Mammalia extends Animal{
	public Mammalia(String name, int age) {
		super(name, age);
	}
	public void feedingMilk() {
			System.out.println(name + " 젖을 먹인다.");
	}
	
	@Override
	public void eat(Object feed) {
		if(feed instanceof String) {
			System.out.println(name + "은 " + feed + "을 먹는다.");
		}else {
			System.out.println(name + "은 음식만 먹을 수 있다.");
		}
	}
	@Override
	public Animal reproduce(String newName) {
		return new Mammalia(newName, 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammalia lion = new Mammalia("사자", 4);
		lion.eat("고기");
		lion.feedingMilk();
		
		lion.eat(123);
		Mammalia babyLion = (Mammalia)lion.reproduce("새끼사자");
		babyLion.eat("우유");
	}

}
