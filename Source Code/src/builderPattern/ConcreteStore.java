package builderPattern;

import java.util.ArrayList;

// class is created to implement and return the details of the concrete items
public class ConcreteStore implements Cloneable{
	private ArrayList<ConcreteItem> concreteItemList = new ArrayList<ConcreteItem>();

	public void addConcreteItem(ConcreteItem concreteItem) {
		concreteItemList.add(concreteItem);
	}

	public double getTotalCost() {
		double totCost = 0;
		for (int i = 0; i < concreteItemList.size(); i++) {
			ConcreteItem concreteItem = concreteItemList.get(i);
			totCost = totCost + concreteItem.getCost();
		}
		return totCost;
	}

	public void dispConcreteItems() {
		for (int i = 0; i < concreteItemList.size(); i++) {
			ConcreteItem concreteItem = concreteItemList.get(i);
			System.out.println("Name: " + concreteItem.getItemName());
			System.out.println("Packing Type: " + concreteItem.getPackingType().doPack());
			System.out.println("Cost: " + concreteItem.getCost());
			System.out.println();
		}
	}
	
	public String getConcreteItems() {
		String concreteItemString="";
		for (int i = 0; i < concreteItemList.size(); i++) {
			ConcreteItem concreteItem = concreteItemList.get(i);
			concreteItemString+="Name: " + concreteItem.getItemName();
			concreteItemString+="\nPacking Type: " + concreteItem.getPackingType().doPack();
			concreteItemString+="\nCost: " + concreteItem.getCost();
			concreteItemString+="\n\n";
		}
		return concreteItemString;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			System.out.println("Clone cannot be done");
		}
		return clone;
	}
}
