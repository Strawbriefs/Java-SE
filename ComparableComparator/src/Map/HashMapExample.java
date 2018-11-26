package Map;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(101,  "Laptop");
		hm.put(102, "Speaker");
		hm.put(103,"Mouse");
		hm.put(104,"LED");
		hm.put(105,"Mobile");
		hm.put(1, null);
		hm.put(1, "0");
		hm.put(0,"null");
		System.out.println("All the Key: "+hm.keySet());
		System.out.println("All the Values: "+hm.values());
		//return specific key or values
		System.out.println(hm.containsValue("Laptop"));
		for(Map.Entry e:hm.entrySet())
		{
			System.out.println("Key: "+ e.getKey()+" "+"Value: "+e.getValue());
		}
	}

}
