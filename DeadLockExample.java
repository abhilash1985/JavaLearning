// DeadLockExample.java

public class DeadLockExample {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		t1.start();
		t2.start();
	}

	public static class Thread1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Hold Lock 1....");
				try {
					Thread.sleep(15);
				} catch(InterruptedException e) {}

				System.out.println("Thread 1: Wait Lock 2....");

				synchronized (Lock2) {
					System.out.println("Thread 1: hold Lock 1 and Lock 2....");
				}
			}
		}
	}

	public static class Thread2 extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Hold Lock 2....");
				try {
					Thread.sleep(10);
				} catch(InterruptedException e) {}

				System.out.println("Thread 2: Wait Lock 1....");

				synchronized (Lock1) {
					System.out.println("Thread 2: hold Lock 1 and Lock 2....");
				}
			}
		}
	}
}
