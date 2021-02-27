// TestCustomExceptionExample.java

// java TestCustomExceptionExample 20
class TestCustomExceptionExample {
	static void validate(int age) throws CustomExceptionExample {
		if (age < 18) {
			throw new CustomExceptionExample("not valid");
		} else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}

		System.out.println("Code is executing");
	}
}
