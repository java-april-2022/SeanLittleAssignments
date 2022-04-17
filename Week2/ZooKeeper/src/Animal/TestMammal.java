package Animal;

public class TestMammal {
	public static void main(String[] args) {
		
		Gorilla kingKong = new Gorilla(100);
		kingKong.throwSomething();
		kingKong.throwSomething();
		kingKong.throwSomething();
		kingKong.eatBanana();
		kingKong.eatBanana();
		kingKong.climbTree();
		
		kingKong.getEnergyLevel();
		
		GiantBat dracula = new GiantBat(300);
		dracula.attackTown();
		dracula.attackTown();
		dracula.attackTown();
		dracula.eatHumans();
		dracula.eatHumans();
		dracula.fly();
		dracula.fly();
		
		dracula.getEnergyLevel();
		
		
	}

}
