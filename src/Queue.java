/* Queue -- a class providing a simple example of the "queue" data structure 
 * -- utilizes only int data types, this is NOT a generic queue structure!!!
 * -- a queue is a FIFO (First In, First Out) data structure, or "The first to get in is the first to get out."
 * -- Think: waiting in line
 * -- 
 * -- NOTE: the value (int)"9999" will stand for "empty" for any particular index of a stack. I don't want to bother with "null" values, and the potential
 * --        complications that could introduce, but I also would like to allow for flexibility to have 0, -0, +0 values.
 * --       the value (int)"9998" denotes an ERROR. There are some methods which need to return an int or an error. In order to avoid try/catch() blocks
 * --        or creating a special object, we'll just have an error value.
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
	
	public boolean isQueueEmpty(){
		boolean empty = true;
		for(int i = 0; i < this.queue.length; i++){
			if(this.queue[i] != 9999){
				empty = false;
			}
		}
		return empty;
	};
	
	public int getLength(){
		return this.queue.length;
	};
	
	public void enqueue(int item){
		
	};
	
	public int dequeue(){
		return 0;
	};
}
