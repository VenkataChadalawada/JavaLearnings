package algo.mergesort;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []inputArray= {3,2,7,1,9,12,4};
		MergeSort sorter = new MergeSort();
		sorter.sort(inputArray);
		for(int i=0;i<inputArray.length;i++){
			System.out.println("insertion sort result: "+inputArray[i]);
		}
	}

}
