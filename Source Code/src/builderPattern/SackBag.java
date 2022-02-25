package builderPattern;

//class created to return the packing type as Sack Bag
public class SackBag implements Packing {
	private String packType = "SackBag";

	// method to return the packing type
	@Override
	public String doPack() {
		return this.packType;
	}

}
