// ComparatorFareExample.java

// package comparable_comparator_demo.ComparableExampleMain;

import java.util.Comparator;

public class ComparatorFareExample implements Comparator<ComparableExample> {
	@Override
	public int compare(ComparableExample o1, ComparableExample o2) {
		return o1.getFare().compareTo(o2.getFare());
	}
}
