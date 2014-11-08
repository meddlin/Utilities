
public class Coordinate {
	private int x;
	private String y;

	public Coordinate(){
		this.setX(99);
		this.setY("");
	};
	
	public Coordinate(int x, String y){
		this.setX(x);
		this.setY(y);
	};

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Coordinate [x=" + x + ", y=" + y + "]";
	};
	
	public boolean isEmpty(){
		if((this.getX() == 99) && (this.getY() == "")){
			return true;
		}else{
			return false;
		}
	};
	
	
}
