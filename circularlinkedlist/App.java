package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList mylist = new CircularLinkedList();
		mylist.insertFirst(100);
		mylist.insertFirst(50);
		mylist.insertFirst(60);
		mylist.insertFirst(90);
		mylist.insertFirst(80);
		mylist.insertFirst(40);
		mylist.insertLast(9990);
		mylist.displayList();
	}

}
