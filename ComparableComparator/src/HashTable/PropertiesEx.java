package HashTable;

import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		//properties object which allow to store only string type by default
		Properties p=new Properties();
		p.put("one","Java");
		p.put("two","Oracle");
		p.put("three","J2EE");
		for(Object ob:p.keySet())
		{
			System.out.println(ob+" List of: "+p.getProperty((String)ob));
		}

	}

}
