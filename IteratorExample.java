// IteratorExample.java

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> names = new LinkedList<>();

		names.add("2A");
		names.add("1B");
		names.add("5C");
		names.add("3D");

		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

        System.out.println();

		// For each loop
		int arr[] = { 15, 21, 10, 345, 43 };

		for(int i: arr) {
			System.out.println(i);
		}
	}
}
