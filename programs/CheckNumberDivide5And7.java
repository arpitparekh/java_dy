package programs;

public class CheckNumberDivide5And7 {

  public static void main(String[] args) {

    int num = 35;

    if (num % 5 == 0 && num % 7 == 0) {
      System.out.println("Divide by 5 and 7");
    } else {
      System.out.println("Not divide by 5 and 7");
    }

    int p = 30;

    if (p % 5 == 0 && p % 7 == 0) {
      System.out.println("Divide by 5 and 7");
    } else if(p % 5 == 0){
      System.out.println("Divide by 5");
    } else if (p % 7 == 0) {
      System.out.println("Divide by 7");
    } else {
      System.out.println("Not divide by 5 and 7");
    }

  }

}
