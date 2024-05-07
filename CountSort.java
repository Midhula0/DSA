import java.util.*;

public class CountSort {
    public static void Count(int[] a, int n, int k) {
        int[] count = new int[k + 1];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            ++count[a[i]];
        }

        for (int i = 1; i <= k; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            b[--count[a[i]]] = a[i];
        }

        for (int i = 0; i < n; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int n = scan.nextInt();
        System.out.print("Enter the range of values (k): ");
        int k = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        Count(a, n, k);

        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
