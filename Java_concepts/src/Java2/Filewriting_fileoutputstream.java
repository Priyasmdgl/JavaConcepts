package Java2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Filewriting_fileoutputstream {

	public static void main(String[] args) throws IOException {
		String file = "fileoutputstream.txt";
		String content = "File writing using fileoutputstream concept in java";
		FileOutputStream outputStream = new FileOutputStream(file);
		byte[] writer = content.getBytes();
		outputStream.write(writer);
		outputStream.close();

	}

}
