package Animal;

public class Gorilla extends Mammal{
	
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}

	public void throwSomething() {
		System.out.println("Watch out for the flying debris!");
		energyLevel -= 5;
	}
	
	public void eatBanana() {
		System.out.println("That is one delicious banana, gimme 10 more!");
		energyLevel += 10;
	}
	
	public void climbTree() {
		System.out.println("It's hard work climbing these trees!");
		energyLevel -= 10;
		
	
	}
}
