/* Queue -- a class providing a simple example of the "queue" data structure 
 * -- utilizes only int data types, this is NOT a generic queue structure!!!
 * -- a queue is a FIFO (First In, First Out) data structure, or "The first to get in is the first to get out."
 * -- Think: waiting in line
 * -- 
 * -- NOTE: the value "9999" will stand for "empty" for any particular index of a stack. I don't want to bother with "null" values, and the potential
 * --  complications that could introduce, but I also would like to allow for flexibility to have 0, -0, +0 values.
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
	
	public boolean isQueueFull(){
		boolean full = true;
		for(int i = 0; i < this.queue.length; i++){
			if(this.queue[i] == 9999){
				return false;
			}
		}
		return full;
	};
	
	public void enqueue(int item){
		
	};
	
	public int dequeue(){
		return 0;
	};
}
