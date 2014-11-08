
public class Player {

	public Ship aircraftCarrier, cruiser, destroyer, submarine, patrolBoat;
	public Board shipWatch, enemyWatch;
	public String name;
	
	public Player(){
		this.aircraftCarrier = new AircraftCarrier();
		this.cruiser = new Cruiser();
		this.destroyer = new Destroyer();
		this.submarine = new Submarine();
		this.patrolBoat = new PatrolBoat();
		
		this.shipWatch = new Board();
		this.enemyWatch = new Board();
	}

	@Override
	public String toString() {
		return "Player [aircraftCarrier=" + aircraftCarrier + ", cruiser="
				+ cruiser + ", destroyer=" + destroyer + ", submarine="
				+ submarine + ", patrolBoat=" + patrolBoat + ", shipWatch="
				+ shipWatch + ", enemyWatch=" + enemyWatch + ", name=" + name
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
