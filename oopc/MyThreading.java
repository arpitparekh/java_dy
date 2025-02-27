package oopc;

class MyThread extends Thread {

    @Override
    public void run() {

      for (int i = 1; i <= 10; i++) {
      
        System.out.println("Hello");
      }

    }



}

public class MyThreading {

  public static void main(String[] args) {

    // Threading // multiThreading
    // thread is sub process
    // thread is a light weight process
    // using a thread we can run multiple task at a time
    // we can sometask in a background

    // there are two ways to create a thread
    // 1. by extending the thread class
    // 2. by implementing the runnable interface

  }

}
