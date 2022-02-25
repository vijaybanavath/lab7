package builderPattern;

// interface is created to implement the concrete item methods
public interface ConcreteItem {
	public String getItemName();

	public Packing getPackingType();

	public double getCost();
}
