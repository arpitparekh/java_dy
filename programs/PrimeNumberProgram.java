package programs;

public class PrimeNumberProgram {

  public static void main(String[] args) {

    // 23 // 2..22

    int num = 23; // 56

    int flag = 0;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        flag = 1;
        break;
      }
    }

    if(flag==0){
      System.out.println("Prime");
    } else {
      System.out.println("Not Prime");
    }

  }

}
