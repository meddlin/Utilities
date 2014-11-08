
public class Submarine extends Ship{
	private static String name = "Submarine";
	
	public Submarine(){
		super(3);
	}
	
	public String getName(){
		return name;
	}
	
	@Override
	public String toString() {
		return "Submarine [getName()=" + getName() + ", getHealth()="
				+ getHealth() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
