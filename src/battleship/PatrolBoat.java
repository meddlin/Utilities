
public class PatrolBoat extends Ship{
	private static String name = "Patrol Boat";
	
	public PatrolBoat(){
		super(2);
	}
	
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "PatrolBoat [getName()=" + getName() + ", getHealth()="
				+ getHealth() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
