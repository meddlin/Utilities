import java.util.Arrays;

/* Stack -- a class providing a simple example of the "stack" data structure 
 * -- utilizes only int data types, this is NOT a generic stack structure!!!
 * -- a stack is a LIFO (Last In, First Out) data structure, or "The last to get in is the first to get out."
 * -- Think: stacking plates
 * -- 
 * -- NOTE: the value (int)"9999" will stand for "empty" for any particular index of a stack. I don't want to bother with "null" values, and the potential
 * --        complications that could introduce, but I also would like to allow for flexibility to have 0, -0, +0 values.
 * --       the value (int)"9998" denotes an ERROR. There are some methods which need to return an int or an error. In order to avoid try/catch() blocks
 * --        or creating a special object, we'll just have an error value.  
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
	
	public boolean isExpandable() {
		return expandable;
	}

	public void setExpandable(boolean expandable) {
		this.expandable = expandable;
	}
	
	/* CONSTRUCTORS */
	// options: standard/custom length | expand/non-expand | numbered/not-numbered

	// this should be a non-expandable Stack
	// create a non-expandable Stack of standard length
	public Stack(){
		theStack = new int[10];
		expandable = false;
	};
	
	public Stack(int[] custom){
		this.theStack = custom;
		this.expandable = false;
	};
	
	public Stack(int[] custom, boolean expand){
		this.theStack = custom;
		this.expandable = expand;
	};
	
	// this should be a non-expandable Stack
	//create a non-expandable Stack of standard length
	public Stack(int x){
		this.theStack = new int[x];
		this.expandable = false;
	};
	
	/* Create a stack of standard length, and number it */
	public Stack(boolean number){
		this.theStack = new int[10];
		this.numberStack();
	};
	
	/* Create a stack of custom length, and number it */
	public Stack(int x, boolean number){
		this.theStack = new int[x];
		this.numberStack();
	};
	
	/* Create an expandable Stack, of standard length */
	
	/* Create an expandable Stack, of custom length, and number it */
	
	
	/* CLASS METHODS */
	public boolean isStackFull(){
		boolean full = true;
		for(int i = 0; i < this.theStack.length; i++){
			if(this.theStack[i] == 9999){
				return false;
			}
		}
		return full;
	};
	
	public boolean isStackEmpty(){
		boolean empty = true;
		for(int i = 0; i < this.theStack.length; i++){
			if(this.theStack[i] != 9999){
				empty = false;
			}
		}
		return empty;
	};
	
	public int getLength(){
		return theStack.length;
	};
	
	/* Pushes a new value onto the stack. */
	public void push(int item){
		if(isStackFull()){
			System.out.println("ERROR: can't push to full stack! can't return because void method signature!");
		}else{
			int lastIndex = getIndexOfLastValue();
			for(int i = lastIndex; i > 0; i--){
				this.theStack[i + 1] = this.theStack[i];
				this.theStack[i] = 9999;
			};
			this.theStack[0] = item;
		};
	};
	
	/* Pops a value from the stack. */
	public int pop(){
		int hold;
		if(this.isStackEmpty()){
			hold = 9998;
		}else{
			hold = this.theStack[0]; // grab the 'top'
			this.theStack[0] = 9999;
			for(int i = 1; i < (this.theStack.length - 1); i++){
				this.theStack[i - 1] = this.theStack[i];
				this.theStack[i] = 9999;
			}
		};
		return hold;
	};
	
	// expands the current stack by the number entered
	public void expandStack(int expansion){
		if(this.expandable){
			// do the expansion
		}else{
			System.out.println("ERROR: stack must be expandable. Try running Stack.makeExpandable();");
		}
	};
	
	// turns a non-expandable stack into an expandable one
	public void makeExpandable(){
		this.expandable = true;
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
	
	// Find the index of the last value before the empty values. Assumes stack is not corrupted.
	private int getIndexOfLastValue(){
		int index = this.theStack.length - 1;
		for(int i = 0; i < (this.theStack.length - 1); i++){
			if(this.theStack[i] == 9999){
				index = i;
				break;
			}
		};
		return index;
	};
	
	// Finds the value of the spot in the stack before the empty values begin. Assumes stack is not corrupted.
	public int getLastValue(){
		return this.theStack[getIndexOfLastValue()];
	}

	@Override
	public String toString() {
		return "Stack [theStack=" + Arrays.toString(theStack) + ", expandable="
				+ expandable + ", getTheStack()="
				+ Arrays.toString(getTheStack()) + ", isExpandable()="
				+ isExpandable() + ", isStackFull()=" + isStackFull()
				+ ", isStackEmpty()=" + isStackEmpty() + ", getLength()="
				+ getLength() + ", pop()=" + pop() + ", getIndexOfLastValue()="
				+ getIndexOfLastValue() + ", getLastValue()=" + getLastValue()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	};
	
}
