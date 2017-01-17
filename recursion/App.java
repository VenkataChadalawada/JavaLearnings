package algo.recursion;

public class App {

	public static void main(String[] args) {
		reducebyOne(10);
		System.out.println(recursiveLinearSearch(new int[]{4,48,5,6,8,34,76,24},0,34));

	}
	public static void reducebyOne(int n){
		if(n>=0){//base case  - every recursive program have a conditional statement which is called basecase
			reducebyOne(n-1); //without a conditional statement it will run into stackoverflow exception
		}
		System.out.println("Completed Call"+n);
	}


					/*output- for recursion
					 * One would  expect 10 comes first ..... but it is waiting for earlier one and so on
					Completed Call-1
					Completed Call0
					Completed Call1
					Completed Call2
					Completed Call3
					Completed Call4
					Completed Call5
					Completed Call6
					Completed Call7
					Completed Call8
					Completed Call9
					Completed Call10
					*/
	public static int recursiveLinearSearch(int[] a, int i,int x){
		//search in array a starting from i and x is the element to be searched
		if(i>a.length-1){ //if evaluates to true , x was not found in the array
			return -1;
		}else if(a[i]==x){
			return i;
		} else{
			System.out.println("index at a:"+ i);
			return recursiveLinearSearch(a,i+1,x);
		}
	}
	
}
	