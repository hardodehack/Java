package garage.count;

public class car extends Vehicle
{
	String name="";
	
	public car(String n) {
		this.name = n;
	}
	
	public String toString() {
		return name;
	}
}
