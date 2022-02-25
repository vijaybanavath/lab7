package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import builderPattern.ConcreteStore;
import decoratorPattern.ConcreteDataDecorator;
import decoratorPattern.ConcreteDataSource;
import factoryPattern.ConcreteFactory;
import factoryPattern.ConcreteSelectorFactory;
import prototypePattern.ConcreteStoreCache;

public class TestConcreteStore {

	@Test
	public void testCementTotalCost() {
		ConcreteStoreCache.initCache();
		ConcreteStore cement = (ConcreteStore) ConcreteStoreCache.getConcreteObject("cementObj");
		double expectedResult = 159.4;
		double actualResult = cement.getTotalCost();
		double delta = 0.01;
		assertEquals(expectedResult, actualResult, delta);
	}

	@Test
	public void testConcreteTotalCost() {
		ConcreteStoreCache.initCache();
		ConcreteStore concrete = (ConcreteStore) ConcreteStoreCache.getConcreteObject("concreteObj");
		double expectedResult = 229.7;
		double actualResult = concrete.getTotalCost();
		double delta = 0.01;
		assertEquals(expectedResult, actualResult, delta);
	}

	@Test
	public void testWriteFile() {
		ConcreteStoreCache.initCache();
		ConcreteStore concrete = (ConcreteStore) ConcreteStoreCache.getConcreteObject("concreteObj");
		String concreteData = concrete.getConcreteItems();
		ConcreteDataDecorator objDecorator = new ConcreteDataDecorator(new ConcreteDataSource());
		boolean expectedResult = true;
		boolean actualResult = objDecorator.writeFile(concreteData);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testGetFileContent() {
		ConcreteStoreCache.initCache();
		ConcreteSelectorFactory selectorObj = new ConcreteSelectorFactory();
		ConcreteFactory concreteObj = selectorObj.getObject("concrete");
		System.out.println(concreteObj.getFileContent());
		boolean expectedResult = true;
		boolean actualResult = false;
		if (concreteObj.getFileContent().contains("Concrete Item details")) {
			actualResult = true;
		}
		assertEquals(expectedResult, actualResult);
	}
}
