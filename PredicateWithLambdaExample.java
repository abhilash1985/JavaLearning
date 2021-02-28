// PredicateWithLambdaExample.java

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;

public class PredicateWithLambdaExample {
	public static void main(String[] args) {
		PredicateExample child1 = new PredicateExample(3);
		PredicateExample child2 = new PredicateExample(2);
		PredicateExample child3 = new PredicateExample(7);
		PredicateExample child4 = new PredicateExample(10);
		PredicateExample child5 = new PredicateExample(6);
		PredicateExample child6 = new PredicateExample(9);
		PredicateExample child7 = new PredicateExample(8);

        List<PredicateExample> childs = Arrays.asList(new PredicateExample[] {
        	child1, child2, child3, child4, child5, child6, child7
        });

        List<PredicateExample> filtered = PredicateExamplePredicates.filterChilds(childs,
        	PredicateExamplePredicates.filterByAge(6));

        for(PredicateExample child: filtered) {
        	System.out.println(child.getAge());
        }
	}
}
