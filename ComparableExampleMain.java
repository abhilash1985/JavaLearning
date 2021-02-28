// ComparableExampleMain.java

// package comparable_comparator_demo.ComparableExampleMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// import java.util.*;

public class ComparableExampleMain {
	public static void main(String[] args) {
		ComparableExample b1 = new ComparableExample(1000, "Wipro Travels", 1500.50d, 4.8d);
		ComparableExample b2 = new ComparableExample(1300, "Java Travels", 1200.50d, 3.8d);
        ComparableExample b3 = new ComparableExample(1200, "J2EE Travels", 1750.50d, 4.9d);
		ComparableExample b4 = new ComparableExample(1100, "JME Travels", 1250.50d, 2.1d);
		ComparableExample b5 = new ComparableExample(1900, "List Travels", 1100.50d, 3.2d);
		ComparableExample b6 = new ComparableExample(1001, "Wow Travels", 1800.50d, 4.1d);

		List<ComparableExample> busList = new ArrayList<ComparableExample>();
		busList.add(b1);
		busList.add(b2);
		busList.add(b3);
		busList.add(b4);
		busList.add(b5);
		busList.add(b6);

		Collections.sort(busList);
		System.out.println("Printing all the values");
		for(int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}

		System.out.println();
		System.out.println();

		Collections.sort(busList, new ComparatorFareExample());

		System.out.println("Printing all the buses sorted based on Fare");

		for(int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}

		System.out.println();
		System.out.println();

		Collections.sort(busList, new ComparatorRatingsExample());

		System.out.println("Printing all the buses sorted based on Ratings");

		for(int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}

		System.out.println();

		System.out.println("Printing all the buses using foreach");

		for(ComparableExample b: busList) {
			System.out.println(b);
		}
	}
}
