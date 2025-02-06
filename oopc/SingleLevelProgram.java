import java.util.Scanner;

class BankAccount {

  int amount = 0;

  void deposit(int amt) {
    amount += amt;
  }

  void withdraw(int amt) {

    if (amt > amount) {
      System.out.println("Insufficient Balance");

    } else {
      amount -= amt;
    }


  }

}

class SavingsAccount extends BankAccount {

  void calculateInterest() { // 3 %

   amount = amount + (amount * 3 / 100);

  }

}

public class SingleLevelProgram {

  public static void main(String[] args) {

    /*
     * Create a BankAccount class with methods like deposit() and withdraw(). Extend
     * it into a SavingsAccount class that adds interest calculation.
     *
     * WAP that declares a class named Person. It should have
     * instance variables to record name, age and salary. Use new
     * operator to create a Person object. Set and display its instance
     * variables.
     *
     */

     Scanner sc = new Scanner(System.in);

     SavingsAccount sa = new SavingsAccount();

     System.out.print("Enter amount : ");
     sa.amount = sc.nextInt();

     System.out.print("Enter deposit amount : ");
     sa.deposit(sc.nextInt());

     System.out.print("Enter withdraw amount : ");
     sa.withdraw(sc.nextInt());

    System.out.println(sa.amount);
    sa.calculateInterest();
    System.out.println("After Intrest : "+sa.amount);

    sc.close();

  }

}
