// WrapperExpample.java
public class WrapperExpample {

  public static void main(String[] args) {
    int a = 20;
    Integer i = Integer.valueOf(a);
    Integer j = a;
    System.out.println(a + " " + i + " " + j);

    Integer b = new Integer(3);
    int c = b.intValue(); // Converting Integer to Int
    int d = b;

    System.out.println(b + " " + c + " " + d);
  }
}
