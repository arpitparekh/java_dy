package oopc;

import java.util.Scanner;

public class TakeInputFromUser {

  public static void main(String[] args) {


    // Scanner
    Scanner obj = new Scanner(System.in);

    // String data = obj.nextLine();  // read string from user
    // System.out.println(data);

    // int num = obj.nextInt();
    // System.out.println(num);

    System.out.println("Enter a number one");
    int a1 = obj.nextInt();
    System.out.println("Enter a number two");
    int a2 = obj.nextInt();
    System.out.println("Enter a number three");
    int a3 = obj.nextInt();

    if (a1 > a2 && a1 > a3) {
      System.out.println(a1 + " is greater");
    } else if (a2 > a3) {
      System.out.println(a2 + " is greater");
    } else {
      System.out.println(a3 + " is greater");
    }

    obj.close(); // release it from memory

  }

}
