package until;

import java.io.FileWriter;
import java.io.IOException;

public class OutputToFile {
	public void outputFile(String outputString,String file) {
		FileWriter writer;
		try {
			writer = new FileWriter(file);
			writer.write(outputString);
			writer.flush();
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
