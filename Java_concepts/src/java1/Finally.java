package java1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Finally {

	static String file = "filereader.txt";
	static BufferedReader reader2 = null;
	static FileReader reader = null;
	public static void main(String[] args) {
		try {
			 reader = new FileReader(file);
			 reader2 = new BufferedReader(reader);
			String content;
			while((content = reader2.readLine()) != null) {
				System.out.println(content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(reader2 !=null)
					reader2.close();
				if(reader != null)
					reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
