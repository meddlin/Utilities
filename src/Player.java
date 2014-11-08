
public class Player {

	public Ship aircraftCarrier, cruiser, destroyer, submarine, patrolBoat;
	public Board shipWatch, enemyWatch;
	public String name;
	
	/* CONSTRUCTORS */
	public Player(){
		// this group of Ships instantiated with child classes is an example of polymorphism
		this.aircraftCarrier = new AircraftCarrier();
		this.cruiser = new Cruiser();
		this.destroyer = new Destroyer();
		this.submarine = new Submarine();
		this.patrolBoat = new PatrolBoat();
		
		this.shipWatch = new Board();
		this.enemyWatch = new Board();
	}
	
	/* GETTERS & SETTERS */	
	public Ship getAircraftCarrier() {
		return aircraftCarrier;
	}

	public void setAircraftCarrier(Ship aircraftCarrier) {
		this.aircraftCarrier = aircraftCarrier;
	}

	public Ship getCruiser() {
		return cruiser;
	}

	public void setCruiser(Ship cruiser) {
		this.cruiser = cruiser;
	}

	public Ship getDestroyer() {
		return destroyer;
	}

	public void setDestroyer(Ship destroyer) {
		this.destroyer = destroyer;
	}

	public Ship getSubmarine() {
		return submarine;
	}

	public void setSubmarine(Ship submarine) {
		this.submarine = submarine;
	}

	public Ship getPatrolBoat() {
		return patrolBoat;
	}

	public void setPatrolBoat(Ship patrolBoat) {
		this.patrolBoat = patrolBoat;
	}

	public Board getShipWatch() {
		return shipWatch;
	}

	public void setShipWatch(Board shipWatch) {
		this.shipWatch = shipWatch;
	}

	public Board getEnemyWatch() {
		return enemyWatch;
	}

	public void setEnemyWatch(Board enemyWatch) {
		this.enemyWatch = enemyWatch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/* CLASS METHODS */
	@Override
	public String toString() {
		return "Player [aircraftCarrier=" + aircraftCarrier + ", cruiser="
				+ cruiser + ", destroyer=" + destroyer + ", submarine="
				+ submarine + ", patrolBoat=" + patrolBoat + ", shipWatch="
				+ shipWatch + ", enemyWatch=" + enemyWatch + ", name=" + name
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public boolean didPlayerLose(){
		if(allShipsDestroyed()){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean allShipsDestroyed(){
		if( (aircraftCarrier.getHealth() == 0) && (cruiser.getHealth() == 0) && (destroyer.getHealth() == 0) && (submarine.getHealth() == 0) && (patrolBoat.getHealth() == 0) ){
			return true;
		}else{
			return false;
		}
	}
	
	public void drawBoard(Board inputBoard){
		
	}
	
	public void resetBoard(Board inputBoard){
		
	}
	
}
