package edu.atria.oops.collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("first", "1st");
		map.put("2nd",new Float(2.0f));
		map.put("third"," 3rd");
		//duplicate- overrides the previous assignment
		map.put("third", 3);
		
		System.out.println("entry of map"+map);
		//to view the map
		//returns the set view of keys
		Set set=map.keySet();
		
		System.out.println("the keys are"+set);
		
		//returns the collection views of values
		Collection collection=map.values();
		System.out.println("collection:"+collection);
		
		Set mapset=map.entrySet();
		System.out.println(set+"\n"+collection+"\n"+mapset);
		
	}

}
