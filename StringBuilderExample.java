// StringBuilderExample.java

class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Greetings");
		System.out.println(sb);

		sb.append(" And Good Morning");
		System.out.println(sb);

		sb.delete(3, 5);
		System.out.println(sb);

		sb.deleteCharAt(10);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		sb.insert(10, " Java ");
		System.out.println(sb);

        // Append Methods
		// StringBuilder append(boolean b)
		// StringBuilder append(char c);
		// StringBuilder append(char[] str);
		// StringBuilder append(char[] str, int offset, int len);
		// StringBuilder append(double d);
		// StringBuilder append(float f);
		// StringBuilder append(int i);
		// StringBuilder append(long l);
		// StringBuilder append(Object obj);
		// StringBuilder append(String s);

		// Delete Methods
		// StringBuilder delete(int start, int end);
		// StringBuilder deleteCharAt(int index);

        // Insert Methods
		// StringBuilder insert(int offeset, booelan b);
		// StringBuilder insert(int offeset, char c);

		// Replace Methods
		// StringBuilder replace(int start, int end, String s);
		// StringBuilder setCharAt(int index, char c);

		// Reverse Methods
		// StringBuilder reverse()

		// toString
		// StringBuilder toString()

		// Mutable
		// int i = 0;

		// Immutable
		// Integer a = 0;
	}
}
