package array_programs;

public class Sorting {

  public static void main(String[] args) {

    int arr[] = { 12, 13, 15, 77, 45, 7, 8, 54 };

    // 12 13 15 45 77 7 8 54
    //  7 13 15 45 77 12 8 54
    //  7 12 15 45 77 13 8 54
    //  7  8 15 45 77 13 12 54

    // This is Bubble Sort implementation in Java.

    for (int i = 0; i < arr.length; i++) { // 12 // arr[i]

      for (int j = i + 1; j < arr.length; j++) { // 13  // arr[j]

        if (arr[i] > arr[j]) { // arr[i] = 7  // arr[j] = 7
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+ " ");
    }

  }

}
