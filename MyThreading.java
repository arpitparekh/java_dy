class MyThread extends Thread {

  @Override
  public void run() {

    for (int i = 0; i < 10; i++) {
      System.out.println("Hello from thread " + Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }

    }
  }

}


class YourClass implements Runnable {

  @Override
  public void run() {

  }

}

public class MyThreading {

  public static void main(String[] args) {

    // Threading // multiThreading
    // thread is sub process
    // thread is a light weight process
    // using a thread we can run multiple task at a time
    // we can sometask in a background

    // Thread
    // extending the thread class
    // implementing the runnable interface

    MyThread t1 = new MyThread();
    t1.start();
    try {
      t1.join() ;
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
    MyThread t2 = new MyThread();
    t2.start();
    MyThread t3 = new MyThread();
    t3.start();

    new Thread(){

    }.start();

    System.out.println("This is Main Method");

  }

}
