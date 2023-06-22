package Arrays.ChallengingOnes;

import java.util.Iterator;
import java.util.Scanner;

public class MinimumProductPair {

    //finding maximum element
    static int findMax(int[] a) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {

            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    //finding second maximum element
    static int findSecondMax(int[] a) {

        int M1 = Integer.MIN_VALUE;
        int M2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (M1 < a[i]) {
                M2 = M1;
                M1 = a[i];
            } else if (M2 < a[i]) {

                M2 = a[i];
            }
        }
        return M2;
    }

    //finding minimum element
    static int findMin(int[] a) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {

            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    //finding second minimum element
    static int findSecondMin(int[] a) {

        int M1 = Integer.MAX_VALUE;
        int M2 = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (M1 > a[i]) {
                M2 = M1;
                M1 = a[i];
            } else if (M2 > a[i]) {

                M2 = a[i];
            }
        }
        return M2;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("enter " + n + " Elements: ");

        for (int i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();
        }

        int min = findMin(a);
        System.out.println("min ="+min);
        int minSec = findSecondMin(a);
        System.out.println("minSec ="+minSec);
        int max = findMax(a);
        System.out.println("max ="+max);
        int maxSec = findSecondMax(a);
        System.out.println("maxSec ="+maxSec);

        if (min < 0 && max > 0) {
            System.out.println(min * max);
        } else if (min > 0) {
            System.out.println(min * minSec);
        } else if (max < 0) {
            System.out.println(max * maxSec);
        }

    }


}

