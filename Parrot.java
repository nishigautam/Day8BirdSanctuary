package birdsanctuary;

public class Parrot extends Bird implements Flyable {
	public static int count;
	
	public void eat() {
		System.out.println("parrot can eat");
	}
	
	public void fly() {
		System.out.println("parrot can fly");
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