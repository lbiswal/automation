package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasic {

	public static void main(String[] args) {
		HashMap<String,String> captial = new HashMap<String,String>();
		captial.put("India","New Delhi");
		captial.put("USA","Washigntin DC");
		captial.put("UK","London");
		captial.put("USA","DC");
		captial.put("null","DC");
		System.out.println(captial);
		Iterator<String> itr = captial.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(captial.get(key));
		}
		Iterator<Entry<String,String>> itr1 = captial.entrySet().iterator();
		while(itr1.hasNext()) {
			Entry<String,String> en = itr1.next();
			System.out.println("Key---"+en.getKey() +"value----"+en.getValue());
	}
		captial.forEach((k,v)->System.out.println(k +""+v));
}
}
