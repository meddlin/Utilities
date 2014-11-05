/* Queue -- a class providing a simple example of the "queue" data structure 
 * -- utilizes only int data types, this is NOT a generic queue structure!!!
 * -- a queue is a FIFO (First In, First Out) data structure, or "The first to get in is the first to get out."
 * -- Think: waiting in line
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
