package factoryPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//class created as derived class of concrete factory interface to implement factory design pattern
public class ConcreteItemFactory implements ConcreteFactory {

	// initialize the file name
	private String fileName = "concrete data.txt";

	// method to read the concrete details from text file
	@Override
	public String getFileContent() {
		File concreteFile = new File(fileName);
		String concreteDetail = "Concrete Item details\n";
		try {
			// concrete item details concatenated with string variable
			BufferedReader concreteReader = new BufferedReader(new FileReader(concreteFile));
			String concreteContent;
			while ((concreteContent = concreteReader.readLine()) != null) {
				concreteDetail += concreteContent + "\n";
			}
			concreteReader.close();
		} catch (IOException e) {
			System.out.println("File cannot be read");
		}
		return concreteDetail;
	}

}
