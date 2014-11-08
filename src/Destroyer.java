
public class Destroyer extends Ship{
	private static String name = "Destroyer";
	
	public Destroyer(){
		super(3);
	}
	
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "Destroyer [getName()=" + getName() + ", getHealth()="
				+ getHealth() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
