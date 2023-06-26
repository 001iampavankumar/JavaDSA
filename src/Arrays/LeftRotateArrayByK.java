package Arrays;

import java.util.Scanner;

public class LeftRotateArrayByK {

    static void leftRotate(int[] a, int k) {
        k = k % a.length;

        //Reversing first half array
        for (int i = 0, j = k - 1; i <= j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        //Reversing second half array
        for (int i = k, j = a.length - 1; i <= j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        //reversing the whole array
        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter left rotations: ");
        int k = sc.nextInt();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        leftRotate(a, k);

        //printing the array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
