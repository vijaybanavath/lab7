package builderPattern;

//abstract concrete class is created for Concrete item
public abstract class Concrete implements ConcreteItem {

	// method to return the packing type of concrete
	@Override
	public Packing getPackingType() {
		return new Bag();
	}

	// method to return the cost of concrete
	@Override
	public abstract double getCost();
}
