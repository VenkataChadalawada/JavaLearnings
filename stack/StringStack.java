package ds.stack;

public class StringStack {
	private char[] stackArray;
	private int top;
	private int maxSize;
	
	StringStack(int size){
		this.maxSize = size;
		this.top = -1;
		this.stackArray = new char[maxSize];
	}
	
	public void push(char s){
		if(isFull()){
			System.out.println("This stack is already full");
		}else{
			top++;
			stackArray[top] = s;
		}
	}
	
	public char pop(){
		if(isEmpty()){
			System.out.println("This stack is already empty");
			return '0';
		}else{
			int old_top = top;
			top--;
			return stackArray[old_top]; 
		}
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return (maxSize-1 == top);
	}
}
