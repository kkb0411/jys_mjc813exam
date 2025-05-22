
public class Herbivore extends Mammalia{
	public Herbivore(String name, int age) {
		super(name, age);
	}
	@Override
	public Mammalia reproduce(String newName) {
		return new Herbivore(newName, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Herbivore deer = new Herbivore("사슴", 3);
		deer.eat("풀");
		deer.feedingMilk();
		
		Herbivore babyDeer =(Herbivore)deer.reproduce("새끼사슴");
		babyDeer.eat("잎사귀");
	}

}
