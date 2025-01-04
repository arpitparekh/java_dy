package programs;

public class MaxOfThree {

  public static void main(String[] args) {

    int a = 10;
    int b = 20;
    int c = 30;

    if (a > b && a > c) {
      System.out.println("A is greatest");
    } else if (b > c) {
      System.out.println("B is greatest");
    } else {
      System.out.println("C is greatest");
    }

    // maximum of 4 numbers
    int p = 10;
    int q = 20;
    int r = 30;
    int s = 40;

    if (p > q && p > r && p > s) {
      System.out.println("P is greatest");
    } else if (q > r && q > s) {
      System.out.println("Q is greatest");
    } else if (r > s) {
      System.out.println("R is greatest");
    } else {
      System.out.println("S is greatest");
    }

  }

}
