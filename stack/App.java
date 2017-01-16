package ds.stack;

public class App {
	public static void main(String[] args){
		Stack theStack = new Stack(3);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
	
		while(!theStack.isEmpty()){
			long value = theStack.pop();
			System.out.println(value);
		}
		//Running StringStack
		
		System.out.println(reverseString("VENKY"));
		
		
	}
	
	public static String reverseString(String str){
		int stackSize = str.length();
		StringStack chrStack = new StringStack(stackSize); //we made the stack
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			chrStack.push(ch);
		}
		String result ="";
		
		while(!chrStack.isEmpty()){
			char ch = chrStack.pop();
			result = result+ch;
		}
		return result;
	}
	
}

/*output
80
60
40
20
*/