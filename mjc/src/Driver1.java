
public class Driver1 {
	private String name;
	private int age;
	private IVehicle ivehicle;
	
	public Driver1(String name, int age, IVehicle ivehicle) {
		this.name = name;
		this.age = age;
		this.ivehicle = ivehicle;
	}
	public void drive() {
		if(ivehicle instanceof Truck1) {
			Truck1 t = (Truck1) ivehicle;
			System.out.println("운전수 " + name + "은 " + t.getwheelCount() + "개의 바퀴의 트럭 " + t.getName() + "를 운전한다." );
		}else if(ivehicle instanceof Bicycle1) {
			Bicycle1 b = (Bicycle1) ivehicle;
			System.out.println("운전수 " + name + "은 " + b.getwheelCount() + "개의 바퀴의 자전거 " + b.getName() + "를 이동한다.");
		}
	}
	public void breakk() {
		if(ivehicle instanceof Truck1) {
			Truck1 t = (Truck1) ivehicle;
			System.out.println("운전수 " + name + "은 트럭 " + t.getName() + "를 정지한다." );
		}else if(ivehicle instanceof Bicycle1) {
			Bicycle1 b = (Bicycle1) ivehicle;
			System.out.println("운전수 " + name + "은 자전거 " + b.getName() + "를 정지한다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
