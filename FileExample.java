// FileExample.java

import java.io.*;
// import java.util.*;
// import java.io.BufferedReader; // Read content from a file

class FileExample {
	public static void main(String[] args) throws java.io.IOException {
		File myFile, myFile2;
		myFile = new File("myfile.txt");

		File myDir = new File("MyDocs/");
		myFile2 = new File(myDir, "myfile.txt");

		BufferedReader in = null;
		String s;

		try {
			in = new BufferedReader(new FileReader(myFile));
			// Read each line from the file
			s = in.readLine();
			while (s != null) {
				System.out.println("Read: " + s);
				s = in.readLine();
			}
		} catch(FileNotFoundException e1) {
			System.out.println("File not found " + myFile);
			s = in.readLine();
		} catch(IOException e2) {
			// Catch Other Exceptions
			e2.printStackTrace();
		} finally {
			// Close the buffered reader
			in.close();
		}

		BufferedReader in2 = null;
		String s2;

		try {
			in2 = new BufferedReader(new FileReader(myFile2));
			// Read each line from the file
			s2 = in2.readLine();
			while (s2 != null) {
				System.out.println("Read: " + s2);
				s2 = in2.readLine();
			}
		} catch(FileNotFoundException e1) {
			System.out.println("File not found " + myFile2);
			s2 = in2.readLine();
		} catch(IOException e2) {
			// Catch Other Exceptions
			e2.printStackTrace();
		} finally {
			// Close the buffered reader
			in2.close();
		}
	}
}
