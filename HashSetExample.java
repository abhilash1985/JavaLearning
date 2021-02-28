// HashSetExample.java

import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		// HashSet declaration
		Set<String> hset = new HashSet<String>();
		// Adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");

		// Adding duplicate elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");

		// Adding null values
		hset.add(null);
		hset.add(null);

		// Display HashSet
		System.out.println("HashSet: " + hset);

		// ArrayList example
		List<String> obj = new ArrayList<String>();

		// Adding elements to ArrayList
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");

		// Add element at the given index
		obj.add(0, "A1");

		// Display ArrayList
		System.out.println("ArrayList: " + obj);

		// HashMap Example
		Map<Integer, String> hmap = new HashMap<Integer, String>();

        // Adding key and value elements to HashMap
		hmap.put(1, "AB");
		hmap.put(2, "CD");
		hmap.put(3, "EF");
		hmap.put(14, "EF");

		// Display content using Iterator
		Iterator<Map.Entry<Integer, String>> it = hmap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> e = it.next();
			System.out.print("Key is: " + e.getKey() + " & Value is: ");
			System.out.println(e.getValue());
		}

		// Get value based on key
		String var = hmap.get(2);
		String var2 = hmap.get(4);
		System.out.println("Value at index 2 is: " + var);
		System.out.println("Value at index 4 is: " + var2);
	}
}
