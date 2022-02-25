package driverCode;

import java.util.Scanner;

import builderPattern.ConcreteStore;
import decoratorPattern.CementDataSource;
import decoratorPattern.ConcreteDataDecorator;
import decoratorPattern.ConcreteDataSource;
import factoryPattern.ConcreteFactory;
import factoryPattern.ConcreteSelectorFactory;
import prototypePattern.ConcreteStoreCache;

public class ConcreteStoreImplementation {
	static Scanner readOption = new Scanner(System.in);

	// main method to start execution of the program
	public static void main(String[] args) {
		// initialize the cache hash table for prototype design pattern
		ConcreteStoreCache.initCache();
		// display the menu items until the user enters exit option
		while (true) {
			System.out.println("\nABC Concrete Store");
			System.out.println("Select any option");
			System.out.println("1. Cement Details");
			System.out.println("2. Concrete Details");
			System.out.println("3. Cement Total cost");
			System.out.println("4. Concrete Total cost");
			System.out.println("5. Write Cement details in file");
			System.out.println("6. Write Concrete details in file");
			System.out.println("7. Read file");
			System.out.println("8. Exit");
			System.out.print("Enter any option: ");
			String option = readOption.nextLine();

			// select the process based on the user option
			switch (option) {
			case "1":
				// display the details of the cement when option 1 is selected
				System.out.println("Cement Item details");
				// call the object from cache as prototype design pattern
				ConcreteStore cement = (ConcreteStore) ConcreteStoreCache.getConcreteObject("cementObj");
				cement.dispConcreteItems();
				break;
			case "2":
				// display the details of the concrete when option 2 is selected
				System.out.println("Concrete Item details");
				// call the object from cache as prototype design pattern
				ConcreteStore concrete = (ConcreteStore) ConcreteStoreCache.getConcreteObject("concreteObj");
				concrete.dispConcreteItems();
				break;
			case "3":
				// display the total cost of the cement when option 3 is selected
				// call the object from cache as prototype design pattern
				cement = (ConcreteStore) ConcreteStoreCache.getConcreteObject("cementObj");
				System.out.println("Total cost of Cement: " + cement.getTotalCost());
				break;
			case "4":
				// display the total cost of the concrete when option 4 is selected
				// call the object from cache as prototype design pattern
				concrete = (ConcreteStore) ConcreteStoreCache.getConcreteObject("concreteObj");
				System.out.println("Total cost of Concrete: " + concrete.getTotalCost());
				break;
			case "5":
				// write the details of the cement when option 1 is selected
				cement = (ConcreteStore) ConcreteStoreCache.getConcreteObject("cementObj");
				String cementData = cement.getConcreteItems();
				// create an object for cement item using decorator design pattern
				ConcreteDataDecorator objDecorator = new ConcreteDataDecorator(new CementDataSource());
				if (objDecorator.writeFile(cementData)) {
					// when the file is successfully written display message
					System.out.println("Cement Details written in text file");
				} else {
					// when the file is not written display message
					System.out.println("Cement Details cannot written in text file");
				}
				break;
			case "6":
				// write the details of the concrete when option 1 is selected
				concrete = (ConcreteStore) ConcreteStoreCache.getConcreteObject("concreteObj");
				String concreteData = concrete.getConcreteItems();
				// create an object for concrete item using decorator design pattern
				objDecorator = new ConcreteDataDecorator(new ConcreteDataSource());
				if (objDecorator.writeFile(concreteData)) {
					// when the file is successfully written display message
					System.out.println("Concrete Details written in text file");
				} else {
					// when the file is not written display message
					System.out.println("Concrete Details cannot written in text file");
				}
				break;
			case "7":
				// read the details of the concrete from text file when option 7 is selected
				String itemName = "";
				// receive the item name until user enters valid name
				while (true) {
					System.out.print("Enter the Item name to read and display from file (Cement/Concrete): ");
					itemName = readOption.nextLine();
					// check the item name received
					if (itemName.equalsIgnoreCase("Cement") || itemName.equalsIgnoreCase("Concrete")) {
						// when the user enters valid name then break the loop
						break;
					} else {
						// when the user enters invalid name then print error message and repeat the
						// loop
						System.out.println("Enter valid item name");
					}
				}
				System.out.println();
				// call the selector class to select the Concrete factor object based on user
				// input using factory design pattern
				ConcreteSelectorFactory selectorObj = new ConcreteSelectorFactory();
				ConcreteFactory concreteObj = selectorObj.getObject(itemName);
				System.out.println(concreteObj.getFileContent());
				break;
			case "8":
				// program terminates when option 8 is selected
				System.out.println("Program ends");
				System.exit(0);
			default:
				// display error message when the invalid input is given
				System.out.println("Enter valid input");
			}
		}
	}
}
