package oopc;

import java.util.Scanner;

class Person {
  String name = "";
  int age = 0;

  Person(String n, int a) {
    name = n;
    age = a;
  }
}

class Adamkhor extends Person {

  int teeth;
  Adamkhor(String n, int a, int t) {
    super(n, a);
    teeth = t;
  }

}

public class AnotherClass {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Adamkhor a = new Adamkhor(sc.next(),sc.nextInt(),sc.nextInt());
    System.out.println(a.name);
    System.out.println(a.age);
    System.out.println(a.teeth);

    Adamkhor a1 = new Adamkhor(sc.next(), sc.nextInt(),sc.nextInt());
    System.out.println(a1.name);
    System.out.println(a1.age);
    System.out.println(a1.teeth);

    Adamkhor a2 = null;
    // System.out.println(a2.name);

    sc.close();

  }

}
