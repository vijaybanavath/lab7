package decoratorPattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//class created as derived class of ConcreteSource and write concrete details in text file
public class ConcreteDataSource implements ConcreteSource {

	// initialize the file name
	private String fileName = "concrete data.txt";

	// method to write the concrete details in text file
	@Override
	public boolean writeFile(String writeData) {
		// when the details written in text file successfully then return true else return false
		File concreteFile = new File(this.fileName);
		try {
			FileWriter concreteWriter = new FileWriter(concreteFile);
			concreteWriter.write(writeData);
			concreteWriter.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}

}
