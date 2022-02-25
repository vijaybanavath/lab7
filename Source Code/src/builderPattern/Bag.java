package builderPattern;

// class created to return the packing type as Bag
public class Bag implements Packing{
	private String packType="Bag";
	
	// method to return the packing type
	@Override
	public String doPack() {
		return this.packType;
	}
	
}
