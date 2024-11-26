package Java2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reading_json {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader("Write.json");
	    Object parsed =	parser.parse(reader);
	    JSONObject jsonobject = (JSONObject) parsed;
	    String name = (String) jsonobject.get("name");
	    long id = (long) jsonobject.get("id");
	    JSONArray array = (JSONArray) jsonobject.get("skills");
	   
	    System.out.println("id:" +id);
	    System.out.println("name:" +name);
	    Iterator iterator = array.iterator();
	    while(iterator.hasNext()) {
	    	System.out.println("skills:" +iterator.next());
	    }
	}
}
