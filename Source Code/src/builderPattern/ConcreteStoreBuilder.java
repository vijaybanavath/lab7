package builderPattern;

// class is created to create and store the details of concrete items in concrete store object
public class ConcreteStoreBuilder {

	// method to add the cement items in the object
	public ConcreteStore buyCementItem() {
		ConcreteStore concreteStore = new ConcreteStore();
		concreteStore.addConcreteItem(new OrdinaryPortlandCement());
		concreteStore.addConcreteItem(new RapidPozzolanaCement());
		return concreteStore;
	}

	// method to add the concrete items in the object
	public ConcreteStore buyConcreteItem() {
		ConcreteStore concreteStore = new ConcreteStore();
		concreteStore.addConcreteItem(new PlainConcrete());
		concreteStore.addConcreteItem(new ReinforcedConcrete());
		return concreteStore;
	}
}
