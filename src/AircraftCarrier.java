
public class AircraftCarrier extends Ship{
	private static String name = "Aircraft Carrier";
	
	public AircraftCarrier(){
		super(5);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "AircraftCarrier [getName()=" + getName() + ", getHealth()="
				+ getHealth() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
