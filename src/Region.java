
public class Region {
	private Coordinate coordinate;
	private boolean hit;
	private boolean ship;
	private String shipCode;

	/* CONSTRUCTORS */
	public Region(){
		this.coordinate = new Coordinate();
		this.hit = false;
		this.ship = false;
	};
	
	public Region(Coordinate location){
		this.coordinate = location;
		this.hit = false;
		this.ship = false;
	};
	
	public Region(Coordinate location, boolean hitValue){
		this.coordinate = location;
		this.hit = hitValue;
		this.ship = false;
	};
	
	public Region(boolean hitValue, boolean shipValue){
		this.coordinate = new Coordinate();
		this.hit = hitValue;
		this.ship = shipValue;
	};
	
	public Region(Coordinate location, boolean hitValue, boolean shipValue){
		this.coordinate = location;
		this.hit = hitValue;
		this.ship = shipValue;
	}
	
	public Region(Coordinate location, boolean hitValue, boolean shipValue, String shipCode){
		this.coordinate = location;
		this.hit = hitValue;
		this.ship = shipValue;
		this.shipCode = shipCode;
	}

	/* GETTERS & SETTERS */
	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public boolean isHit() {
		return hit;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public boolean isShip() {
		return ship;
	}

	public void setShip(boolean ship) {
		this.ship = ship;
	}

	public String getShipCode() {
		return shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	/* CLASS METHODS */
	@Override
	public String toString() {
		return "Region [coordinate=" + coordinate + ", hit=" + hit + ", ship="
				+ ship + "]";
	};
	
	public void drawRegion(){
		if( (getCoordinate() != null) && (getShipCode() != null) ){
			//draw
		}else{
			System.out.println("ERROR: Region not ready for drawing.");
			toString();
		}
	}
	
}
