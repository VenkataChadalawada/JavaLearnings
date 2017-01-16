# JavaLearnings
All of all my java learnings

The main Java program stack and heap working process
local variables will be in the stack

reference variable in stack and its gonna point to the memory address on the heap where the car object resides when we say
Car mycar = new Car(); // mycar conatins adress where the Car object resides
when we say Car mycar2 = new Car() // the heap creates another Car object and the mycar2 will be containing that new heap objects address

Garbage collection:
garbage collection runs on heap and it clears unused objects from the memory every certain amount of time.


Algorithm Analysis Big O notation:---
1)) linear time ex: -  looping , recursions
public int countEvens(int elements[]){
	int count = 0;
	for (int i=0;i<elements.length;i++){
		if(elements[i]%2 == 0){
			count++;
		}
	}
}
O(n)

2))Constant time ex:
public int getElementFrom(int []a, int index){
	return a[index];
}
O(1)


3))Quadratic time ex- nested loops:
public int countDuplicates(int items1[], int items2[]){
	int count;
	for(int i=0;i<items1.length;i++){
		for(int j=0;j<items2.length;j++){
			if(items1[i]==items2[j]){
				count++;
			}
		}
	}
	return count;
}
O(n^2)

4)) Cubic time 3 loops O(n^3)

5)) Exponential n loops O(n^n)

STACK:
Last In First Out LIFO
This will have an ARRAY of size MAX_SIZE and a maintaining pointer at its top TOP
make sure if u defines a stack size of 10 and trying to insert 11th element you will face arrayindexoutofbounds exception

QUEUE:
First In First Out FIFO
printer , a patients waiting list
private int maxSize; //initializes the set number of slots
	private long[] queArray; // slots to main data
	private int front; // this will be the index position for the element in the front
	private int rear; // going to be the index position of last element
	private int nItems; //counter to maintain the number of items in our queue
