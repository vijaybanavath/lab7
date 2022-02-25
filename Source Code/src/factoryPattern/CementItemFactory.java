package factoryPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// class created as derived class of concrete factory interface to implement factory design pattern
public class CementItemFactory implements ConcreteFactory {

	// initialize the file name
	private String fileName = "cement data.txt";

	// method to read the cement details from text file
	@Override
	public String getFileContent() {
		File cementFile = new File(fileName);
		String cementDetail = "Cement Item details\n";
		try {
			// cement item details concatenated with string variable
			BufferedReader cementReader = new BufferedReader(new FileReader(cementFile));
			String cementContent;
			while ((cementContent = cementReader.readLine()) != null) {
				cementDetail += cementContent + "\n";
			}
			cementReader.close();
		} catch (IOException e) {
			System.out.println("File cannot be read");
		}
		return cementDetail;
	}

}
