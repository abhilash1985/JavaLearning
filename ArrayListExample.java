// ArrayListExample.java

import java.util.*;

class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // Create ArrayList
		list.add("A"); // Add Object to ArrayList
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");

		Iterator itr = list.iterator(); // Traversing list through Iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
