// PredicateExamplePredicates.java

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class PredicateExamplePredicates {
	static Predicate<PredicateExample> filterByAge(int x) {
		return a -> a.getAge() > x;
	}

	static List<PredicateExample> filterChilds(List<PredicateExample> childs, Predicate<PredicateExample> predicate) {
		return childs.stream().filter(predicate).collect(Collectors.<PredicateExample> toList());
	}

	public static void main(String[] args) {

	}
}
