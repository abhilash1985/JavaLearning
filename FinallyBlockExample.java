// FinallyBlockExample.java
// Used to execute important code such as closing connection, stream, etc
// Always executed irrespective of excepion handled or not.
// Follows try or catch block
// similar to ensure in Ruby

class FinallyBlockExample {
	public static void main(String[] args) {
		try {
			int x = 300;
			// final int x = 200;// final keyword
			// finalize is a method
			// x = 300;
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally Block is executed");
		}
	}
}
