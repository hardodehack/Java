package garage.count;


public class MainClass {

	public static void main(String[] args) {
		
		car c1 = new car("Audi R!");
		car c2 = new car("Bugaati");
		car c3 = new car("M Benz");
		
		bike b1 = new bike("Suzuki RX2");
		bike b2 = new bike("Activa");
		bike b3 = new bike("Fz eeeee");
		
		garage.build();
		
		garage.openDoor();
		
		System.out.println("Initial Garage status " + (((garage.door)==garage.status.close)?"Closed":"Open"));
		
		
		System.out.println("Parking audi : " + garage.parkVehicle(c1));
		System.out.println("Parking bugati : " + garage.parkVehicle(c2));
		System.out.println("Parking m benz : " + garage.parkVehicle(c3));
		System.out.println("Parking suzuki RX2 : " + garage.parkVehicle(b1));
		System.out.println("Parking activa : " + garage.parkVehicle(b2));
		System.out.println("Parking Fz eeee : " + garage.parkVehicle(b3));
		
		System.out.println( garage.garage_content());
	}

}
