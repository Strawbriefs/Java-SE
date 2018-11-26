package HashTable;

import java.util.*;

//hashtable is synchronized where as hashmap not synchronized
//hashtable there will be no null as key and value but in hashmap there can be null as key and value
//hashtble examples
public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String,Integer> book=new Hashtable<String,Integer>();
		book.put("Java",500);
		book.put("Oracle",new Integer(455));
		book.put("PhP", new Integer(300));
		book.put("Nod JS", new Integer(650));
		book.put("0",0);
		book.put("0",0);
		for(Map.Entry me:book.entrySet())
		{
			System.out.println(me.getKey()+":"+" "+me.getValue());
		}
		System.out.println("--------------------------------------------------");
		
		Hashtable<Integer,Integer> obj=new Hashtable<Integer,Integer>();
		obj.put(1,500);
		obj.put(2,new Integer(455));
		obj.put(3, new Integer(300));
		obj.put(0, 0);
		for(Map.Entry me:obj.entrySet())
		{
			System.out.println(me.getKey()+":"+" "+me.getValue());
		}
	}

}
