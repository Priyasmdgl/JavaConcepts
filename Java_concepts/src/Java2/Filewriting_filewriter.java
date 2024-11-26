package Java2;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriting_filewriter {

	public static void main(String[] args) throws IOException {
		String file = "filewriter.txt";
		String content = "File writing using File writer concept in java";
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(content);
		fileWriter.close();

	}

}
