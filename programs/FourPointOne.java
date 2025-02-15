package programs;

import java.util.Scanner;

class Employee {
  int code;
  String name;
  String designation;
  int basicPay;
  int hra = 0; // 10%
  int da = 0; // 45%
  int totalPay = 0;

  Employee(int c, String n, String d, int bp) {
    code = c;
    name = n;
    designation = d;
    basicPay = bp;
  }

  void calculateHra() {
    hra =  (basicPay * 10) / 100;
  }

  void calculateDa() {
    da = (basicPay * 45) / 100;
  }

  void calculateTotalPay() {
    totalPay = basicPay + hra + da;
  }

  void display() {
    System.out.println("Code : " + code);
    System.out.println("Name : " + name);
    System.out.println("Designation : " + designation);
    System.out.println("Basic Pay : " + basicPay);
    System.out.println("HRA : " + hra);
    System.out.println("DA : " + da);
    System.out.println("Total Pay : " + totalPay);
  }

}


public class FourPointOne {

  /*
   * The employee list for a company contains employee code, name,
   * designation and basic pay. The employee is given HRA of 10% of
   * the basic and DA of 45% of the basic pay. The total pay of the
   * employee is calculated as Basic pay+ HRA+ DA. Write a class to
   * define the details of the employee. Write a constructor assign the
   * required initial values.
   *
   * Add a method to calculate HRA, DA and
   * Total pay and print them out. Write another class with a main
   * method. Create objects for three different employees and calculate
   * the HRA, DA and total pay.
   *
   */

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of employees : ");
    int n = sc.nextInt();
    System.out.println("Enter the Name of the employee : ");
    sc.nextLine();

    String name = sc.nextLine();
    System.out.println("Enter the Designation of the employee : ");

    String designation = sc.nextLine();
    System.out.println("Enter the Basic Pay of the employee : ");
    int basicPay = sc.nextInt();

    char ch = '\n';

    Employee e1 = new Employee(n, name, designation, basicPay);
    e1.calculateHra();
    e1.calculateDa();
    e1.calculateTotalPay();
    e1.display();

  }

}
