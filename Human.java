package prepforalgos;

public class Human {
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	
	public Human(String name, int age, int heightInInches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	/*
	 * public Human(){
		this.age = 5;
		this.eyeColor = "brown";
		this.heightInInches = 72;
		this.name = "Tom Paul";
	}
	*/
	
	public void speak(){
		System.out.println("Hello, my name is"+name);
		System.out.println("Iam"+heightInInches+"inches tall");
		System.out.println("Iam"+age+" years old");
		System.out.println("My eye color is"+eyeColor);
	}
	
	public void eat(){
		System.out.println("eating...");
	}
	
	public void walk(){
		System.out.println("walking....");
	}
	
	public void work(){
		System.out.println("working....");	
	}
}
