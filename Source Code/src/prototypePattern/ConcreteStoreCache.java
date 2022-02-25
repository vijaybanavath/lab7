package prototypePattern;

import java.util.Hashtable;

import builderPattern.ConcreteStore;
import builderPattern.ConcreteStoreBuilder;

// class created to return the object from the cache
public class ConcreteStoreCache {
	// hash table is created to store the concrete object with a key
	private static Hashtable<String, ConcreteStore> concreteCache = new Hashtable<String, ConcreteStore>();

	// method to return the corresponding object as clone based on the received
	// string
	public static ConcreteStore getConcreteObject(String objId) {
		ConcreteStore concreteStore = concreteCache.get(objId);
		return (ConcreteStore) concreteStore.clone();
	}

	// method to initialize the hash table with key
	public static void initCache() {
		ConcreteStoreBuilder concreteBuilder = new ConcreteStoreBuilder();
		ConcreteStore cement = concreteBuilder.buyCementItem();
		ConcreteStore concrete = concreteBuilder.buyConcreteItem();

		concreteCache.put("cementObj", cement);
		concreteCache.put("concreteObj", concrete);
	}
}
