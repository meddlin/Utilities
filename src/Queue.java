/* Stack -- a class providing a simple example of the "stack" data structure 
 * --utilizes only int data types, this is NOT a generic stack structure!!!
 * */
public class Queue {
	int[] queue;
	
	/* GETTERS & SETTERS */
	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] queue) {
		this.queue = queue;
	}

	/* CONSTRUCTORS */
	public Queue(){
		queue = new int[10];
	};
	
	public Queue(int x){
		queue = new int[x];
	};
	
	/* CLASS METHODS */
	public void push(int item){
		
	};
	
	public int pop(){
		return 0;
	};
}
