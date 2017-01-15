package prepforalgos;

public class earth {
	public static void main(String args[]){
		
		Human human1 = new Human("Tom",25,76,"Blue");
		Human human2 = new Human("Joe",28,68,"green");
		
		
		human1.speak();
		human2.speak();
		
		/*
		Human human3 = new Human();
		human3.speak();
		*/
		
		/* earlier example
		Human tom;
		tom = new Human();
		tom.age = 5;
		tom.eyeColor = "brown";
		tom.heightInInches = 72;
		tom.name = "Tom Paul";
		tom.speak();
		
		Human joe = new Human();
		joe.age = 36;
		joe.eyeColor = "brown";
		joe.heightInInches = 72;
		*/
	}
}
