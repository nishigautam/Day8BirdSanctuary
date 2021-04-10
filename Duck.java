package birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable{
	public static int count;
	
	public void swim() {
		System.out.println("Duck can swim.");
	}
	
	public void eat() {
		System.out.println("Duck can eat.");
	}
	
	public void fly() {
		System.out.println("Duck can fly.");
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void incrementCount() {
		count++;		
	}

	@Override
	public void decrementCount() {
		count--;
		
	}
}