import java.util.*;

public class SelectionSort {
    static void Selection(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] < arr[min]) {
                    min = j; 
                }
            }
            if (min != i) {
                int temp = arr[i]; 
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of values to be entered in array: ");
        int n = s.nextInt();
        System.out.println("Enter the values for array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Selection(arr, n);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
