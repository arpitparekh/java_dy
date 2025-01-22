public class MyLoops {

  void display() {
    System.out.println("Hello");
  }

  public static void main(String[] args) {

    // while
    // do while
    // for

    // int i = 1;
    // while (i <= 10) {
    //   System.out.println(i);
    //   i++;
    // }

    // A a = new A();  // to allocate memory

    // System.out.print("Hello"); // for single line
    // System.out.println("Hi");

    for (int i = 1; i <= 5; i++) { // i = 1,2,3,4,5

      for (int j = 1; j <= 5; j++) {
        if (i == 1 || i == 5 || j == 1 || j == 5) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }

      System.out.println();
    }

    System.out.println();


    MyLoops ml = new MyLoops();
    ml.display();

  }
}
