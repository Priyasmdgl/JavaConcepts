package java1;

import java.util.HashMap;
import java.util.Map;

public class MapHashmap {

	public void hashmap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		//insertion
		map.put(3, "GHI");
		map.put(1, "ABC");
		map.put(2, "DEF");
		
		System.out.println(map);
		//duplicate
		Map<Integer, String> map2 = new HashMap<Integer, String>();
				map2.putAll(map);
				System.out.println(map2);
	    //check if key is present
		System.out.println(map.containsKey(1));
		//check if value is present
		System.out.println(map.containsValue("DEF"));
		//get
		System.out.println(map.get(2));
		//size
		System.out.println(map.size());
		//remove
		System.out.println(map.remove(3));
		//returns key 
		System.out.println(map.keySet());
		//returns values
		System.out.println(map.values());
		//returns key-value pairs
		System.out.println(map.entrySet());
		//is empty
		System.out.println(map.isEmpty());
		
	}
	public static void main(String[] args) {
		MapHashmap map = new MapHashmap();
		map.hashmap();

	}

}
