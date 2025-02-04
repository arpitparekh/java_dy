package oopc;

import java.util.Scanner;

public class ObjectArray {

  public static void main(String[] args) {

    Scanner sc  = new Scanner(System.in);
    System.out.println("Bhai ketla object banava che?");
    int count = sc.nextInt();  // 5

    College[] objs = new College[count];

    for (int i = 0; i < objs.length; i++) {

      // give values to the object
      System.out.println("Enter name");
      String name = sc.next();
      System.out.println("Enter roll");
      int roll = sc.nextInt();
      System.out.println("Enter marks");
      int marks = sc.nextInt();

      objs[i] = new College(name, roll, marks);

    }

    for (int i = 0; i < objs.length; i++) {

      objs[i].display();

    }

  }

}

class College {
  String name = "";
  int roll = 0;
  int marks = 0;

  College(String n, int r, int m) {
    name = n;
    roll = r;
    marks = m;
  }

  void display() {
    System.out.println("Name : " + name);
    System.out.println("Roll : " + roll);
    System.out.println("Marks : " + marks);
  }

}
