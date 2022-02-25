package builderPattern;

// abstract concrete class is created for Cement item
public abstract class Cement implements ConcreteItem {
	
	// method to return the packing type of cement
	@Override
	public Packing getPackingType() {
		return new SackBag();
	}
	
	// method to return the cost of cement
	@Override
	public abstract double getCost();
	
}
