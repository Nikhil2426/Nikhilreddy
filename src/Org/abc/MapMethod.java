package Org.abc;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethod {
	
	public static void main(String[] args) {
		
		Map<Integer,String> m = new LinkedHashMap<>();
	 m.put(10, "Nikhil");
	  m.put(20, "reference");
	  m.put(50, "value");
	  
	  System.out.println(m);
	  System.out.println(m.size());
	  String s = m.get(20);
	  System.out.println(s);
	  
	 boolean h = m.containsKey(10);
	  System.out.println(h);
	  Set<Integer> k = m.keySet();
	  System.out.println(k);
	  Collection<String> values = m.values();
	  System.out.println(values);
	  Set<Entry<Integer, String>> entrySet = m.entrySet();
	  for (Entry<Integer, String> x : entrySet) {
		  System.out.println(x);
		  
		
	}
	  
		
	}
	 
	  
	 
		
		
		
	}


