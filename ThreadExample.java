// ThreadExample.java

public class ThreadExample {
	public static void main(String[] args) {
		HelloRunner r = new HelloRunner();
		Thread t = new Thread(r);
		t.start();
	}
}
