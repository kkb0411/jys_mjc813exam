
public interface IVehicle {
	String drive();
	String breakk();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck1 truck1 = new Truck1("봉고", 5);
		Bicycle1 bike1 = new Bicycle1("삼천리",2);
		
		Driver1 truckDriver1 = new Driver1("홍길동", 35, truck1);
		Driver1 bikeRider1 = new Driver1("김철수", 21, bike1);
		
		System.out.println("=== 트럭 운전 ===");
		truckDriver1.drive();
		truckDriver1.breakk();
		
		System.out.println("\n=== 자전거 운전 ===");
		bikeRider1.drive();
		bikeRider1.breakk();
	}
}


