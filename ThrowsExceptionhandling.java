// ThrowsExceptionhandling.java
// java ThrowsExceptionhandling 1 two 20

import java.io.IOException;

class ThrowsExceptionhandling {
	void m() throws IOException {
		throw new IOException("Device error"); // checked Exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch(Exception e) {
			System.out.println("Exception corrected");
		}
	}

	public static void main(String[] args) {
		ThrowsExceptionhandling obj = new ThrowsExceptionhandling();
        obj.p();
		System.out.println("Program Works Fine...");
	}
}

// throws syntax
// throw - followed by an instance, throws - by class
// throw - single exception, throws multiple exception
// return type method_name() throws exception_class_name {
// }
