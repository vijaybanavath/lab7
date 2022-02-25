package decoratorPattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// class created as derived class of ConcreteSource and write cement details in text file
public class CementDataSource implements ConcreteSource {

	// initialize the file name
	private String fileName = "cement data.txt";

	// method to write the cement details in text file
	@Override
	public boolean writeFile(String writeData) {
		// when the details written in text file successfully then return true else return false
		File cementFile = new File(this.fileName);
		try {
			FileWriter cementWriter = new FileWriter(cementFile);
			cementWriter.write(writeData);
			cementWriter.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}

}
