package garage.count;

import java.util.ArrayList;

public class garage {
	
	enum status { close,open };
	
	static status door = status.close;
	
	final static int limitBikes = 2;
	final static int limitCars = 1;
	
	static int currBikes = 0;
	static int currCars = 0;
	
	static ArrayList<Vehicle> holds = null;
	
	public static void build() {
		holds = new ArrayList<Vehicle>();
	}
	
	public static String parkVehicle(Vehicle k) {
		String message="";
		if(door==status.close) {
			message = "Please open door first!";
		}
		else if(k.getClass()==car.class) {
			if(currCars < limitCars) {
				currCars += 1;
				holds.add(k);
				message = "Now the garage holds : ";
				for(Vehicle veh : holds) {
					message+= veh.toString();
				}
				return message;
			}
		}
		else if(k.getClass()==bike.class) {
			if(currBikes < limitBikes) {
				currBikes += 1;
				holds.add(k);
				message = "Now the garage holds : ";
				for(Vehicle veh : holds) {
					message+= veh.toString()+" , ";
				}
				return message;
			}
		}
		message = "Garage FULL";
		return message;
	}
	
	public static String garage_content() {
		String message = "Now the garage holds : ";
		for(Vehicle veh : holds) {
			message+= veh.toString() + " , ";
		}
		return (message==null?"Empty":message);
	}
	
	public static boolean openDoor() {
		if(door == status.close) {
			door=status.open;
			return true;
		} else {
			return false;
		}
	}
	public static boolean closeDoor() {
		if(door == status.open) {
			door=status.close;
			return true;
		} else {
			return false;
		}
	}

}
