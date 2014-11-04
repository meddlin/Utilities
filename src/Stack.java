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
		// create a new stack with an additional space
		int[] newStack = new int[this.theStack.length + 1];
		// copy old stack to new one, with 'top' space left blank
		int newStackCount = 1;
		for(int i = 0; i < this.theStack.length; i++){
			newStack[newStackCount] = this.theStack[i];
			newStackCount++;
		}
		// put the new 'item' in the 'top' space
		newStack[0] = item;
		
		this.theStack = newStack;
	};
	
	public int pop(){
		return 0;
	};
}
