package birdsanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryManager {
	List<Bird> birdList = new ArrayList<Bird>();
	public void addBird(Bird bird) {
		birdList.add(bird);
		bird.incrementCount();
	}
	public void remove(Bird bird) {
		birdList.remove(bird);
		bird.decrementCount();
	}
	
	public void printEatingBirds() {
		for(Bird bird: birdList) {
			bird.eat();
		}
	}
	
	public void printFlyingBirds() {
		for(Bird bird: birdList) {
			if(bird instanceof Flyable) {
				((Flyable)bird).fly();
			}
		}
	}
	
	public void printSwimmableBirds() {
		for(Bird bird: birdList) {
			if(bird instanceof Swimmable) {
				((Swimmable)bird).swim();
			}
		}
	}
}