
public class Carnivore extends Mammalia{
	public Carnivore(String name, int age) {
		super(name, age);
	}
	@Override
	public void eat(Object feed) {
		if(feed instanceof Herbivore) {
			Herbivore prey = (Herbivore)feed;
			System.out.println(name + "은 " + prey.name + "를 먹는다.");
		}else {
			System.out.println(name + "은 초식동물만 먹는다.");
		}
	}
	@Override
	public Mammalia reproduce(String newName) {
		return new Carnivore(newName, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carnivore tiger = new Carnivore("호랑이", 5);
		Herbivore deer = new Herbivore("사슴", 2);
		 tiger.eat(deer);
		 tiger.eat("고기");
		 
		 Carnivore babyTiger = (Carnivore)tiger.reproduce("새끼호랑이");
		 babyTiger.feedingMilk();
	}

}
