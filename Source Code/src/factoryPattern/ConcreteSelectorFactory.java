package factoryPattern;

// class is created to select the concrete factory object based on received item name
public class ConcreteSelectorFactory {

	// method to return the concrete factory object
	public ConcreteFactory getObject(String itemName) {
		// check the item name
		if (itemName.equalsIgnoreCase("Cement")) {
			// when the item name is cement then return cement item factory object
			return new CementItemFactory();
		} else if (itemName.equalsIgnoreCase("Concrete")) {
			// when the item name is concrete then return concrete item factory object
			return new ConcreteItemFactory();
		} else {
			// when the item name is not match with itme name then return null
			return null;
		}
	}

}
