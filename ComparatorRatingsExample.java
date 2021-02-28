// ComparatorRatingsExample.java

// package comparable_comparator_demo.ComparableExampleMain;

import java.util.Comparator;

public class ComparatorRatingsExample implements Comparator<ComparableExample> {
	@Override
	public int compare(ComparableExample o1, ComparableExample o2) {
		return o1.getRatings().compareTo(o2.getRatings());
	}
}
