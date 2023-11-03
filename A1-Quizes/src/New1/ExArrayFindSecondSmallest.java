package New1;

import java.util.Scanner;

public class ExArrayFindSecondSmallest {
  public static void main(String[] args) {
    // Intialising the variables
    int n, min;
    Scanner Sc = new Scanner(System.in);

    // Enter the number of elements.
    System.out.print("Enter number of elements : ");
    n = Sc.nextInt();

    // creating an array.
    int a[] = new int[n];

    // enter array elements.
    System.out.println("Enter the elements in array : ");
    for (int i = 0; i < n; i++) {
      a[i] = Sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          min = a[i];
          a[i] = a[j];
          a[j] = min;
        }
      }
    }
    System.out.println("The Smallest element in the array is :" + a[1]);
  }
}
