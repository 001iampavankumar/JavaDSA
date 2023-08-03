package Sorting.RadixSort;

import java.util.*;

public class RadixSortUsingCountSort {

    static void countSort(int[] arr,int exp){


        int[] count = new int[10];

        for(int i = 0;i<arr.length;i++){

            count[(arr[i]/exp)%10]++;
        }

        for(int i = 1;i<count.length;i++){

            count[i] = count[i-1] + count[i];
        }


        int[] output = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--){

            output[--count[(arr[i]/exp)%10]] = arr[i];
        }

        System.arraycopy(output,0,arr,0,arr.length);
    }

    static void radixSort(int[] arr){

        int max = max(arr);
        for(int exp = 1;((max/exp)>0);exp = exp * 10){

            countSort(arr,exp);
        }

    }

    static int max(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(max<i){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("After sorting: ");

        radixSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
