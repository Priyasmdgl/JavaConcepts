package Java2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filewriting_path {

	public static void main(String[] args) throws IOException {
		String location = "path.txt";
		String content = "File writing using path concept in java";
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());

	}

}
