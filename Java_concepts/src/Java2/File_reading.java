package Java2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_reading {

	public static void main(String[] args) throws IOException {
		String file = "filereader.txt";
		FileReader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String content;
		while((content = bufferedReader.readLine())!=null) {
			System.out.println(content);
		}
	}
}
