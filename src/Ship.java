/*
 * Ship -- parent ship class for the game Battleship
 * 
 * For more ships: http://www.navy.mil/navydata/our_ships.asp
 * */
public class Ship {
	private int health;
	
	/* CONSTRUCTORS */
	public Ship(){};
	
	public Ship(int hp){
		this.setHealth(hp);
	};

	/* GETTERS & SETTERS */
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	/* CLASS METHODS */
	public void hit(){
		this.setHealth(this.getHealth() - 1);
	}

	@Override
	public String toString() {
		return "Ship [health=" + health + ", getHealth()=" + getHealth()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
