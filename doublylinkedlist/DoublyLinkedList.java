package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList(){
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()){
			last = newNode; // if empty, last will refer to the new node being created
		} else{
			first.prev = newNode;
		}
		
		newNode.next = first; // the new node's next field will point to the old first
		this.first = newNode;
	}
	
	public void insertlast(int data){
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			first = newNode;
		}else{
			last.next = newNode; // assigning old last to new node
			newNode.prev = last;
		}
		//newNode.prev = last;
		last = newNode;
	}
	
	//assume non - empty list
	public Node deleteFirst(){
		Node temp = first;
		if(first.next == null){
			//there are only 1 item in the list
			last = null;
		}else{
			first.next.prev = null; //lists first node to null
		}
		
		first = first.next; // we are assigning the reference of the node following the old first node to the to the first field in th elinked list object 
		return temp; //return the deleted old first node
	}
	
	//assume non - empty list
	public Node deleteLast(){
		Node temp = last;
		if(last.prev == null){
			first = null;
		}else{
			last.prev.next = null; //lists last node to null
		}
		last = last.prev;
		return temp;
	}
	
	//assume non-empty list
	public boolean insertAfter(int key, int data){
		Node current = first; // we start from beginning of the list
		while(current.data!=key){//as long as we have not found the key in a particular node
			current = current.next;
			if(current == null){
				return false;
			}
		}
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last){
			current.next = null;
			last = newNode;
		} else{
			newNode.next = current.next; // new nodes next field point to the node ahead of the current one
			current.next.prev = newNode; // the node ahead of current its previous field should point to the previous
		}
		newNode.prev = current;
		current.next = newNode;
		
		return true;
	}
	
	//assume non-empty list
	public Node deleteKey(int key){
		Node current = first;
		while(current.data!=key){//as long as we have not found the key in a particular node
			current = current.next;
			if(current == null){
				return null;
			}
		}
		
		if(current == first){
			first = current.next; //make the first field to the node following current since current will be deleted
		} else{
			current.prev.next = current.next;
		}
		if(current == last){
			last = current.prev;
		} else{
			current.next.prev = current.prev;
		}
		
		return current;
	}
	
	public void displayForward(){
		System.out.println("List (first --> last)");
		Node current = first;
		while(current!=null){
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}

	public void displayBackward(){
		System.out.println("List (last --> first)");
		Node current = last;
		while(current!=null){
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}

}
