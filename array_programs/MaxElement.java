package array_programs;

public class MaxElement {

  public static void main(String[] args) {

    int arr[] = { 12, 13, 95, 77, 45, 7, 8, 54 };

    int max = arr[0];  // 12 // 13 // 15 // 77

    for (int i = 0; i < arr.length; i++) {

      if (max < arr[i]) {
        max = arr[i];
      }

    }

    System.out.println("Max element is : " + max);

  }

}
