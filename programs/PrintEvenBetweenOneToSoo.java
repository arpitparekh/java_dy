package programs;

public class PrintEvenBetweenOneToSoo {

  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    int sum = 0;  // 1  // 3  // 6

    for (int i = 1; i <= 100; i++) { // i 1,2,3,4,5
      sum = sum + i;
    }

    System.out.println(sum);

    /*
     * Write a program to find the sum of all even numbers between 1 to n.
     * Write a program to find the sum of all odd numbers between 1 to n.
     */

  }
}
