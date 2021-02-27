public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World!!!");

    Variables obj = new Variables();
    obj.method();
    System.out.println(obj.data); // instance variable can be accessed
    // System.out.println(obj.n); // Cannot be accessed as it is local variable
    System.out.println(Variables.m); // class variable can be accessed with class name

    User u_obj = new User();
    u_obj.setAge(25);
    System.out.println(u_obj.getAge());

    u_obj.setFirstName("MyFName");
    System.out.println(u_obj.getFirstName());

    String s1 = new String("Hello");
    String s2 = new String("Hello");

    if(s1.equals(s2)) {
      System.out.println("s1.equals(s2) is TRUE");
    } else {
      System.out.println("s1.equals(s2) is FALSE");
    }

    if(s1 == s2) {
      System.out.println("s1 == s2 is TRUE");
    } else {
      System.out.println("s1 == s2 is FALSE");
    }

    // Switch conditions

    // switch(s1) {
    //   case "Hell"
    //     System.out.println("Hi");
    //     break;

    //   // default
    //   //   System.out.println("not exists");
    // }

    // Loops
    for(int i = 0; i <= 3; i++ ) {
      System.out.println("For: Value of i is " + i);
    }

    int i = 1;
    while(i <= 3) {
      System.out.println("While: Value of i = " + i);
      i++;
    }

    do {
      System.out.println("Do While: Value of i : " + i);
      i++;
    } while(i <= 5);

    // Define array and Break
    int [] numbers = { 5, 10, 15, 20, 25 };
    for(int x: numbers) {
      if(x == 20) {
        x = x + 1;
        System.out.print("Final Value = " + x + "\n");
        break;
      }
      System.out.print(x);
      System.out.print("\n");
    }

    int [] numbers2 = { 5, 15, 25, 35, 45 };
    for(int x: numbers2) {
      if(x == 25) {
        continue;
      }
      System.out.print(x);
      System.out.print("\n");
    }

    // Array

    // Point[] p;
    char[] s;
    String[] names = { "John", "James", "Simon" };
    // System.out.print("names array " + names[2] + " - " + names[4] + "\n"); // Throws exception
    System.out.print("names array " + names[2] + " - " + names[0] + "\n");

    // Initialize integer array
    int a[] = new int[3];
    a[0] = 1;
    a[1] = 2;
    a[2] = 5;
    System.out.print("int array " + a[0] + " - " + a[1] + " - " + a[2] + "\n");
  }
}
