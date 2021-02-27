// ArraytoList.java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Example for primitive Array to List
public class ArraytoList {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// List<Integer> list = IntStream.of(number).boxed().collect(Collectors.toList());
		List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());
		System.out.println("List: " + list);

		// multiDimensional array
		int iarr[][] = new int[2][2];
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[1][0] = 10;
		iarr[1][1] = 20;

		System.out.println("iarr[1][0]: " + iarr[1][0]);

		// int counts[];
		// int[] counts; // Both 1 and 2 are equal
		// boolean flags[ ]; // extra spaces not significant
        // String names[];
        // MyClass [][] things; // 2-D Array
	}
}

// key methods in java.util.Arrays = Arrays.method_name

// binarySearch(array, value) = returns index of the given value in a sorted Array
// binarySearch(array, minIndex, maxIndex, value) = returns index of the given value in a sorted Array btw indexes min & max
// copyOf(array, length) = returns new resized copy of an array
// equals(arr1, arr2)
// fill(array, value) = sets every element to the given value
// sort(array)
// toString(array) => "[10, 1, 3, -5]"
