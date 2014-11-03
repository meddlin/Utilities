/* Stack -- a class providing a simple example of the "stack" data structure 
 * --utilizes only int data types, this is NOT a generic stack structure!!!
 * */
public class Stack {
	int[] theStack;
	
	/* GETTERS & SETTERS */
	public int[] getTheStack() {
		return theStack;
	}

	public void setTheStack(int[] theStack) {
		this.theStack = theStack;
	}
	
	/* CONSTRUCTORS */
	public Stack(){
		theStack = new int[10];
	};
	
	public Stack(int x){
		theStack = new int[x];
	};
	
	/* CLASS METHODS */
	public int getLength(){
		return theStack.length;
	};
	
	public void push(int item){
		
	};
	
	public int pop(){
		return 0;
	};
}
