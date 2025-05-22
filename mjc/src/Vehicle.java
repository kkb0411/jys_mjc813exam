
public abstract class Vehicle {
	protected int wheelCount;
	
	public  Vehicle(int wheelCount) {
		this.wheelCount = wheelCount;
	}
	public abstract void move();
	public abstract void stop();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck("봉고", 5,6);
		Bicycle bike = new Bicycle("삼천리",2);
		
		Driver truckDriver = new Driver("홍길동", 35, truck);
		Driver bikeRider = new Driver("김철수", 21, bike);
		
		System.out.println("=== 트럭 운전 ===");
		truckDriver.drive();
		truckDriver.brake();
		
		System.out.println("\n=== 자전거 운전 ===");
		bikeRider.drive();
		bikeRider.brake();
	}

}
