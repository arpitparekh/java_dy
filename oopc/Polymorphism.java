package oopc;

class MeraClass {

  void display(String name, int b) {

  }

  void display(int a, String name) {

  }

}

class Parent2 extends Parent1 {

  @Override
  void fun(int a) {
    System.out.println("Parent2");
  }

}

public class Polymorphism {

  public static void main(String[] args) {

    // polymorphism(split personality, bahugunita)
    // many form

    // method overloading // one class
    // no of parameter should be different
    // order of parameter should be different

    // method overriding // inheritance
    // when parnet and child class have same method name and same number of
    // parameter

    // System.out.println("Hello World");

    Parent2 p2 = new Parent2();
    p2.fun(12);

  }

}

class Parent1 {

  void fun(int a) {
    System.out.println("Parent1");
  }

}
