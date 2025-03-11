class MyClass extends Thread {

  String name;

  MyClass(String name) {
    this.name = name;
  }

  @Override
  public void run() {

    for (int i = 1; i <= 5; i++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        System.out.println(e.getMessage());
      }
      System.out.println(name + " " + i);
    }

  }

}

public class ThreadProgramInJava {

  public static void main(String[] args) {

    MyClass mc1 = new MyClass("Hello");
    MyClass mc2 = new MyClass("Hi");

    mc1.start();
    try {
      mc1.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      System.out.println(e.getMessage());
    }
    mc2.start();

  }

}
