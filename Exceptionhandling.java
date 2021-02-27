// Exceptionhandling.java
// java Exceptionhandling 1 two 20
class Exceptionhandling {
	public static void main(String[] args) {
		try {
			int sum = 0;
			for(int i = 0; i < args.length; i++) {
				sum += Integer.parseInt(args[i]);
			}

			System.out.println("Sum = " + sum);
		} catch (NumberFormatException nfe) {
			System.err.println("One of the command line arguments is not an integer");
			System.err.println("Error: " + nfe.getMessage());
		}

	}
}

// throws syntax
// throw - followed by an instance, throws - by class
// throw - single exception, throws multiple exception
// return type method_name() throws exception_class_name {
// }
