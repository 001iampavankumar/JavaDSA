package arrays.BasicPrograms;

import java.util.Scanner;

public class MinimumProductPair {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int minProduct = findMinimumProduct(a);
        System.out.println(minProduct);

    }

    public static int findMinimumProduct(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements");
        }

        int min1 = Integer.MAX_VALUE; // Smallest element
        int min2 = Integer.MAX_VALUE; // Second smallest element
        int max1 = Integer.MIN_VALUE; // Largest element
        int max2 = Integer.MIN_VALUE; // Second largest element

        for (int num : arr) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }

            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        // Considering two cases: a negative number multiplied by a positive number, or two negative numbers

        System.out.println(min1 + " " + min1);
        System.out.println(max1 + " " + max2);

        int product1 = min1 * min2;
        int product2 = max1 * max2;

        return Math.min(product1, product2);
    }
}

