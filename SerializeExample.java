// SerializeExample.java

import java.util.*;
import java.io.*;

public class SerializeExample {
	SerializeExample() {
		Date d = new Date();
        try {
        	FileOutputStream f = new FileOutputStream("date.ser");
        	ObjectOutputStream s = new ObjectOutputStream(f);
        	s.writeObject(d); // Serialization starts here
        	s.close();
        } catch (IOException e) {
        	e.printStackTrace();
        }
	}

	public static void main(String[] args) {
		new SerializeExample();
	}
}
