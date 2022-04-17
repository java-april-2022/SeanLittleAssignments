package Animal;

public class Mammal {
	protected int energyLevel;

	public int getEnergyLevel() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	

}
