package oopc;

import java.util.Scanner;

public class Circle {

  double radius = 0.0;

  Circle(double r) {
    radius = r;
  }

  double area() {
    return 3.14 * radius * radius;
  }



}

class A {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Circle c = new Circle(sc.nextDouble());
    System.out.println(String.format("Area of the Circle is : %.2f", c.area()));
    sc.close();

  }

}
