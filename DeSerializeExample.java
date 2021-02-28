// DeSerializeExample.java

import java.util.*;
import java.io.*;

public class DeSerializeExample {
    DeSerializeExample() {
    	Date d = null;
        try {
        	FileInputStream f = new FileInputStream("date.ser");
        	ObjectInputStream s = new ObjectInputStream(f);
            d = (Date) s.readObject(); // DeSerialization starts here
        	s.close();
        } catch (Exception e) {
        	e.printStackTrace();
        }

        System.out.println("DeSerialized Date Object from date.ser");
        System.out.println("Date: " + d);
    }

    public static void main(String args[]) {
    	new DeSerializeExample();
    }
}
