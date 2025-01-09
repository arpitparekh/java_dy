public class LoopInsideLoop {

  public static void main(String[] args) { // rows

    /*
     *
     *****
     *****
     *****
     *****
     *****
     *
     *
     */

    int count = 0;

    for (int i = 1; i <= 5; i++) { // i = 1,2

      for (int j = 1; j <= 5; j++) { // j = 1 // columns

        // System.out.println("Hello World");
        // count++;
        // System.out.println(count);
        System.out.print("*");

      }

      System.out.println();

    }

    /*
    *
    **
    ***
    ****
    *****
    */

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    /*
     *
     ***** // i=1 => 5
     ****
     ***
     **
     *
     */

    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= 6 - i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    /*

         *
        **
       ***
      ****
     *****

     */

    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= 5 - i; j++) { // 4 // 3  // 2 // 1 // 0
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) { // 1  // 2 // 3  /4 // 5
        System.out.print("*");
      }
      System.out.println();
    }

    /*

     *****
      ****
       ***
        **
         *

     */

    for (int i = 1; i <= 5; i++) {

      for (int j = 2; j <= i; j++) { // 4 // 3 // 2 // 1 // 0
        System.out.print(" ");
      }

      for (int j = 1; j <= 6-i; j++) { // 1 // 2 // 3 /4 // 5
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
