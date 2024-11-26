package Java2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriting_bufferedwriter {

	public static void main(String[] args) throws IOException {
		String file = "bufferedwriter.txt";
		String content = "File writing using Buffered writer concept in java";
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();

	}

}
