package ds.queue;

public class Queue {
	private int maxSize; //initializes the set number of slots
	private long[] queArray; // slots to main data
	private int front; // this will be the index position for the element in the front
	private int rear; // going to be the index position of last element
	private int nItems; //counter to maintain the number of items in our queue

	public Queue(int size){
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0;
		rear = -1; // there is no item in the array yet to be considered as the last item
		nItems = 0; //we dont have elements in the array yet
	}
	
	public void Insert(long j){
		//when we insert into queue they go to the end each time, fill the rear and increment the counter
		if(rear == maxSize -1){
			rear = -1; //making as circular queue
		}
		rear++;
		queArray[rear] = j;
		nItems++;
	}
	
	public long remove(){
		//remove item from front of queue
		long temp = queArray[front];
		front++;
		if(front==maxSize){
			front = 0; // we can set back the front to 0 and utilize the entire array freshly again
		}
		nItems--;
		return temp;
	}
	
	public long peekFront(){
		return queArray[front];
	}
	
	public boolean isEmpty(){
		return (nItems == 0);
	}
	
	public boolean isFull(){
		return (nItems == maxSize);
	}
	
	public void view(){
		System.out.print("[ ");
		for(int i=0;i<queArray.length;i++){
			System.out.println(queArray[i]+" ");
		}
		System.out.print("]");
	}

}
