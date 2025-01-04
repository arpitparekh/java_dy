public class Conditions {

  public static void main(String[] args) {

    // condition statements in java
    // if else

    int age = 20;

    // relational operators // logical operators
    if (age < 18) {
      System.out.println("Under Age");
    } else {
      System.out.println("Adult");
    }

    // if else ladder

    int num = -45;

    // else if

    if (num < 0) {
      System.out.println("Number is negative");
    } else if (num > 0) {
      System.out.println("Number is positive");
    } else if (num == 20) {
      System.out.println("Number is 20");
    } else if (num == 30) {
      System.out.println("Number is 30");
    } else {
      System.out.println("Number is zero");
    }

    // nested if else

    int x = 10, y = 20;

    if (x != y) {

      if (x < 20) {

        if (x > 10) {
          System.out.println("Inner If");
        } else {
          System.out.println("Inner Else");
        }

      } else {
        System.out.println("Inner Inner Else");
      }

    } else {
      System.out.println("Outer Else");
    }

    

  }

}
