/*
 * Ship -- parent ship class for the game Battleship
 * 
 * For more ships: http://www.navy.mil/navydata/our_ships.asp
 * */
public class Ship {
	private int health;
	
	public Ship(){};
	
	public Ship(int hp){
		this.setHealth(hp);
	};

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void hit(){
		this.setHealth(this.getHealth() - 1);
	}
}
