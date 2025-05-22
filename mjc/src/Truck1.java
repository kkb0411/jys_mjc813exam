
public class Truck1 implements ITruck{
	private String name;
	private int wheelCount;
	
	public Truck1(String name, int wheelCount) {
		this.name = name;
		this.wheelCount = wheelCount;
	}
	public String getName() {
		return name;
	}
	public int getwheelCount() {
		return wheelCount;
	}
	@Override
	public String drive() {
		return wheelCount + "개의 바퀴의 트럭" + name + "를 운전한다"; 
	}
	@Override
	public String breakk() {
		return "트럭" + name + "를 정지한다.";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
