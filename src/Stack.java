/* Stack -- a class providing a simple example of the "stack" data structure 
 * --utilizes only int data types, this is NOT a generic stack structure!!!
 * */
public class Stack {
	int[] theStack;
	boolean expandable;
	
	/* GETTERS & SETTERS */
	public int[] getTheStack() {
		return theStack;
	}

	public void setTheStack(int[] theStack) {
		this.theStack = theStack;
	}
	
	/* CONSTRUCTORS */
	// options: standard/custom length | expand/non-expand | numbered/not-numbered
	
	
	// this should be a non-expandable Stack
	// create a non-expandable Stack of standard length
	public Stack(){
		theStack = new int[10];
		expandable = false;
	};
	
	// this should be a non-expandable Stack
	//create a non-expandable Stack of standard length
	public Stack(int x){
		theStack = new int[x];
		expandable = false;
	};
	
	/* Create a stack of standard length, and number it */
	public Stack(boolean number){
		theStack = new int[10];
		numberStack();
	};
	
	/* Create a stack of custom length, and number it */
	public Stack(int x, boolean number){
		theStack = new int[x];
		numberStack();
	};
	
	/* Create an expandable Stack, of standard length */
	
	/* Create an expandable Stack, of custom length, and number it */
	
	
	/* CLASS METHODS */
	public int getLength(){
		return theStack.length;
	};
	
	/* Pushes a new value onto the stack. The resulting stack has 1 more space. */
	public void push(int item){
		int[] newStack = new int[this.theStack.length + 1]; // create a new stack with an additional space
		
		int newStackCount = 1; // copy old stack to new one, with 'top' space left blank
		for(int i = 0; i < this.theStack.length; i++){
			newStack[newStackCount] = this.theStack[i];
			newStackCount++;
		}
		
		newStack[0] = item; // put the new 'item' in the 'top' space
		this.theStack = newStack;
	};
	
	/* Pops a value from the stack. The resulting stack has 1 less space. */
	public int pop(){
		int hold = this.theStack[0]; // grab the 'top'  
		
		// create a new stack with one less space
		int[] newStack = new int[this.theStack.length - 1];
		
		// copy old stack to new one, with [1] index now at the [0] index
		int newStackCount = 0;
		for(int i = 1; i < this.theStack.length; i++){
			newStack[newStackCount] = this.theStack[i];
			newStackCount++;
		}
		this.theStack = newStack;
		
		return hold;
	};
	
	/* Loops stack and prints each entry on a new line -- for debugging purposes */
	public void printStack(){
		System.out.println("printing Stack...");
		for(int i = 0; i < this.theStack.length; i++){
			System.out.println("stack[" + i + "]: " + this.theStack[i]);
		}
	};
	
	/* Places values 0 - n in stack. Stack should be initialized with all values at "0" from constructor, but this allows 
	 * for some slightly different data. */
	public void numberStack(){
		for(int i = 0; i < this.theStack.length; i++){
			this.theStack[i] = i;
		}
	};
}
