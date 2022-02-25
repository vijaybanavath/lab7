package builderPattern;

// class is created to add the details of ordinary portland cement type
public class OrdinaryPortlandCement extends Cement {
	// class instances are created with details of ordinary portland cement
	private String itemName = "Ordinary Portland Cement";
	private double cost = 80.9;

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
