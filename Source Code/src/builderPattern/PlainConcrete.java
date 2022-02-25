package builderPattern;

// class is created to add the details of plain concrete type
public class PlainConcrete extends Concrete {
	// class instances are created with details of plain concrete
	private String itemName = "Plain Concrete";
	private double cost = 105.3;

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
