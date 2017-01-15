# JavaLearnings
All of all my java learnings

The main Java program stack and heap working process
local variables will be in the stack

reference variable in stack and its gonna point to the memory address on the heap where the car object resides when we say
Car mycar = new Car(); // mycar conatins adress where the Car object resides
when we say Car mycar2 = new Car() // the heap creates another Car object and the mycar2 will be containing that new heap objects address

Garbage collection:
garbage collection runs on heap and it clears unused objects from the memory every certain amount of time.
