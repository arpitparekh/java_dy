public class ConditionalOperator {

  public static void main(String[] args) {


    // if else elseif switch
    int a = 12;

    if (a < 10) {
      System.out.println("a is less than 10");
    } else if (a > 10) {
      System.out.println("a is greater than 10");
    } else {
      System.out.println("a is equal to 10");
    }


    char ch = 'a';

    int num = 12;

    switch (num) {
      case 1:
        System.out.println("a");
        break;
      case 2:
        System.out.println("b");
        break;
      case 12:
        System.out.println("c");
        break;
      default:
        System.out.println("default");
        break;
    }


  }

}
