package algo.linearsearch;

public class App {
	public static void main(String[] args){
		
		int []a=new int[]{24,54,36,87,45};
		int out = linearSearch(a,87);
	}
	
	public static int linearSearch(int[] a, int x){
		for(int i=0;i<a.length;i++){
			if(a[i]==x){
				return i;
			}
		}
		return -1;
	}
}

//complexity O(n)