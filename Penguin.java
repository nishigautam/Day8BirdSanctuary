package birdsanctuary;

public class Penguin extends Bird implements Swimmable{
	public static int count;
	
	public void swim() {
		System.out.println("Penguin can swim.");
	}
	
	public void eat() {
		System.out.println("Penguin can eat.");
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
