package Arrays.TwoSortedArrays;

import java.util.Scanner;

public class RepeatedElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        if(arr1.length == 0 || arr2.length ==0 ){
            return;
        }

        for (int i = 0; i < arr1.length; i++) {

            int rep = 0;
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    if (rep != arr2[j]) {
                        System.out.print(arr2[j]+" ");
                        rep = arr2[j];
                        arr2[j] = 0;
                    }
                }

            }
        }


    }

}
