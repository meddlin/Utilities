
public class Cruiser extends Ship{
	private static String name = "Cruiser";
	
	public Cruiser(){
		super(4);
	}
	
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "Cruiser [getName()=" + getName() + ", getHealth()="
				+ getHealth() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
