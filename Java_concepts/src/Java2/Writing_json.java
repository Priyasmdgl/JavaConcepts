package Java2;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Writing_json {

	public static void main(String[] args) throws IOException {
		JSONObject object = new JSONObject();
		object.put("id", 1);
		object.put("name", "Priya");
		JSONArray array = new JSONArray();
		array.add("Java");
		array.add("Selenium");
		object.put("skills", array);
		FileWriter writer = new FileWriter("Write.json");
		writer.write(object.toJSONString());
		writer.close();
		

	}

}
