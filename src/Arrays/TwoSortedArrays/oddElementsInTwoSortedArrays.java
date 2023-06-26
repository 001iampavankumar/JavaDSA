package Arrays.TwoSortedArrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class oddElementsInTwoSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        if (arr1.length == 0 || arr2.length == 0) {
            return;
        }
        int c = 0;

        for (int i = 0; i < arr1.length; i++) {

            int rep = Integer.MIN_VALUE;
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    if (rep != arr2[j] && arr2[j] % 2 != 0) {
                        al.add(arr2[j]);
                        rep = arr2[j];
                        c = 1;
                        arr2[j] = Integer.MIN_VALUE;
                    }
                }

            }
        }

        if (c == 0) {
            System.out.println("No common odd elements found.");
            return;
        }
        Collections.sort(al);
        for (int i : al) {
            System.out.print(i + " ");

        }

    }
}

