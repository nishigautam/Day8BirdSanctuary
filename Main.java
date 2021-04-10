package birdsanctuary;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("***Welcome to Bird Sanctuary***");
		
		BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();
		 
		Duck duck = new Duck();
		Duck duck2 = new Duck();
		Parrot parrot = new Parrot();
		Penguin penguin = new Penguin();
		
		birdSanctuaryManager.addBird(duck);
		birdSanctuaryManager.addBird(duck2);
		birdSanctuaryManager.addBird(parrot);
		birdSanctuaryManager.addBird(penguin);
		
		birdSanctuaryManager.remove(penguin);
		
		birdSanctuaryManager.printFlyingBirds();
		birdSanctuaryManager.printEatingBirds();
		birdSanctuaryManager.printSwimmableBirds();
		
		System.out.println("Duck Count :" + Duck.count);
		System.out.println("Parrot Count :" + Parrot.count);
		System.out.println("Penguin Count :" + Penguin.count);
	}
}