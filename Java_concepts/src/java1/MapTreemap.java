package java1;

import java.util.Map;
import java.util.TreeMap;

public class MapTreemap {
	
	public void treemap() {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		//insertion
		map.put(1, "ABC");
		map.put(2, "DEF");
		map.put(4, "MNO");
		map.put(3, "GHI");
		System.out.println(map);
		//get
		System.out.println(map.get(2));
		//contains key
		System.out.println(map.containsKey(4));
		//contains value
		System.out.println(map.containsValue("GHI"));
		//size
		System.out.println(map.size());
		//is empty
		System.out.println(map.isEmpty());
		
		
	}

	public static void main(String[] args) {
		MapTreemap map = new MapTreemap();
		map.treemap();

	}

}
