class A3 {

  void hello(String name) {
    System.out.println("A3: Hello from " + name);
  }

}

class B3 extends A3 {

  @Override
  void hello(String name) {
    super.hello(name); // super keyword / /dynamic method dispatch
  }

}


interface Shape2D {

  void getArea();
}

public class DynamicMemoryDispatch {

  public static void main(String[] args) {

    // Threading // multiThreading
    // thread is sub process
    // thread is a light weight process
    // using a thread we can run multiple task at a time
    // we can sometask in a background

    /*
     * WAP that illustrates method overriding. Class A3 is extended by
     * Class B3. Each of these classes defines a hello (string s) method
     * that outputs the string "A3: Hello from" or "B3: Hello from"
     * respectively. Use the concept Dynamic Method Dispatch and
     * keyword super.
     *
     */

    B3 b3 = new B3();
     b3.hello("Arpit");

  }

}
