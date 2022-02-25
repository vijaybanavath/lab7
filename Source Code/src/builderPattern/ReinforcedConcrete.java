package builderPattern;

// class is created to add the details of reinforced concrete type
public class ReinforcedConcrete extends Concrete {
	// class instances are created with details of reinforced concrete
	private String itemName = "Reinforced Concrete";
	private double cost = 124.4;

	// method to return the item name
	@Override
	public String getItemName() {
		return this.itemName;
	}

	// method to return the cost
	@Override
	public double getCost() {
		return this.cost;
	}
}
