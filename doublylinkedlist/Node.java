package ds.doublylinkedlist;

public class Node {
	public int data;
	public Node next;
	public Node prev;
	
	public void displayNode(){
		System.out.println("{"+data+"}");
	}
}