// HelloRunner.java
// example for Thread

public class HelloRunner implements Runnable {
	int i;

	public void run() {
		i = 0;
		while(true) {
			System.out.println("Hello " + i++);
			if (i == 30) {
				break;
			}
		}
	}

	public static void main(String[] args) {
	}
}
