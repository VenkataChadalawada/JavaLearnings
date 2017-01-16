package ds.queue;

public class App {

	public static void main(String[] args){
		Queue myQueue = new Queue(5);
		myQueue.Insert(100);
		myQueue.Insert(1000);
		myQueue.Insert(14);
		myQueue.Insert(12);
		myQueue.Insert(44);
		myQueue.Insert(33);
		myQueue.view();
	}
}
