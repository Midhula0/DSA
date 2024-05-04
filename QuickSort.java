import java.util.*;
public class QuickSort {
    static int partition(int[] a, int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;
        int temp;
        while (start < end) {
            while (a[start] <= pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;
        return end;
    }

    static void Quicksort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a, lb, ub);
            Quicksort(a, lb, loc - 1);
            Quicksort(a, loc + 1, ub);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int lb = 0;
        int ub = n - 1;
        Quicksort(a, lb, ub);
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
