package builderPattern;

// class is created to add the details of rapid pozzolana cement type
public class RapidPozzolanaCement extends Cement {
	// class instances are created with details of rapid pozzolana cement
	private String itemName = "Rapid Pozzolana Cement";
	private double cost = 78.5;

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
