package Animal;

public class GiantBat extends Mammal{
	
	public GiantBat(int energyLevel) {
		super(energyLevel);
	}

	public void fly() {
		System.out.println("SWOOSH!");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("That is one delicious toe, gimme a finger for dessert!");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The roof, The roof, The roof is on FIRE! We don't need no water let the...");
		energyLevel -= 100;
		
	
	}
}

