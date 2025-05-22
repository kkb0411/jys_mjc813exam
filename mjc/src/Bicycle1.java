
public class Bicycle1 implements IBicycle{
	private String name;
	private int wheelCount;
	
	public Bicycle1(String name, int wheelCount) {
		this.name = name;
		this.wheelCount = wheelCount;
	}
	public String getName() {
		return name;
	}
	public int getwheelCount() {
		return wheelCount;
	}
	public String move() {
		return wheelCount + "개의 바퀴의 자전거" + name + "을 이동한다.";
	}
	@Override
	public String breakk() {
		return "자전거" + name + "을 정지한다.";
	}
	@Override
	public String drive() {
		return move();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
