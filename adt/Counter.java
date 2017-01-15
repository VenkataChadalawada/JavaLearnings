package adt;

public class Counter {
  private int a=0;
  private String name = null;
  
  Counter(String str){
	  this.name = str;
  }
  
  public void increment(){
	  a++;
  }
  
  public int getCurrentValue(){
	  return a;
  }
  
  public String toString(){
	  
	  return name + ": "+a;
  }
  
}
