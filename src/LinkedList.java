import java.util.ArrayList;

public class LinkedList {
	private ArrayList<Node> list;
	private static final int standardConstructorLength = 10;
	
	/* CONSTRUCTORS */
	// create a new LinkedList of standard length -- 10
	public LinkedList(){
		list = new ArrayList<Node>();
		// instantiate the list with anonymous Node objects
		for(int i = 0; i < (standardConstructorLength - 1); i++){
			list.add(new Node(i));
		}
	}

	/* GETTERS & SETTERS */
	public ArrayList<Node> getList() {
		return list;
	}

	public void setList(ArrayList<Node> list) {
		this.list = list;
	}

	public static int getStandardconstructorlength() {
		return standardConstructorLength;
	}

	/* CLASS METHODS */
	public void populateListPayload(){
		for(int i = 0; i < (list.size() - 1); i++){
			list.get(i).setPayload("waaaahh!");
		}
	}
	
	public void addNode(){}
	public void removeNode(){}
	public void insertNode(int afterNode){}
	
	@Override
	public String toString() {
		return "LinkedList [list=" + list + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public void printListData(){
		for(int i = 0; i < (list.size() - 1); i++){
			System.out.println(list.get(i));
		}
	}
	
	public void printList(){
		for(int i = 0; i< (list.size() - 1); i++){
			System.out.println( "NODE " + i + " >> " + "ID:" + list.get(i).getID() + " Payload: " + list.get(i).getPayload() );
		}
	}
	
}
