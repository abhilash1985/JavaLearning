// Test.java
public class Test {
	public static void main(String[] args) {
    int i = 100;
    long l = i; // no explicit type casting required.
    float f = i; // no explicit type casting required.

    System.out.println("Int Value " + i);
    System.out.println("Long Value " + l);
    System.out.println("Float Value " + f);

    double d = 100.04;
    long m = (long)d; // explicit typing required.
    int n = (int)d; // explicit typing required.
    int i2 = (int)m; // explicit typing required. // int i = already defined.

    System.out.println("Double Value " + d);
    System.out.println("Long Value " + m);
    System.out.println("Int Value " + n);
    System.out.println("Int Value2 " + i2);
  }
}