
public class Driver {
	private String name;
	private int age;
	private Vehicle vehicle;
	
	public Driver(String name, int age, Vehicle vehicle) {
		this.name = name;
		this.age=age;
		this.vehicle = vehicle;
	}
	public void drive() {
		vehicle.move();
	}
	public void brake() {
		vehicle.stop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
