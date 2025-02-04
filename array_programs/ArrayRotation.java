package array_programs;

import java.util.Scanner;

public class ArrayRotation {

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 5 };

    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();  // 5

    for(int k=1;k<=count;k++){


      int first = arr[0];

      for (int i = 0; i < arr.length; i++) {
        if (i < 4) {
          arr[i] = arr[i + 1];
        }

      }

      arr[arr.length - 1] = first;

      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }

      System.out.println();

    }


  }

}
