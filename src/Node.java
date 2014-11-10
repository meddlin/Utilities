
public class Node {
	private int ID;
	private String payload;
	
	/* CONSTRUCTORS */
	
	// generates and empty Node
	public Node(){
		this.setID(99); //99 is 'empty' value
		this.setPayload("");
	};
	
	// generate new Node, custom ID
	public Node(int newID){
		this.setID(newID);
		this.setPayload("");
	};
	
	// generate new Node, custom ID and payload
	public Node(int newID, String payload){
		this.setID(newID);
		this.setPayload(payload);
	};
	
	/* GETTERS & SETTERS */
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

	/* CLASS METHODS */
	@Override
	public String toString() {
		return "Node [ID=" + ID + ", payload=" + payload + ", getID()="
				+ getID() + ", getPayload()=" + getPayload() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
