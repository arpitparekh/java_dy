package programs;

public class Factors{
  public static void main(String[] args) {

    int num = 24;

    for (int i = 2; i <= num; i++) {
      if (num % i == 0) {
        System.out.println(i);
      }
    }

  }
}
