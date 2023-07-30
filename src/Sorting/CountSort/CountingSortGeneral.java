package Sorting.CountSort;
import java.util.*;
import java.util.Scanner;

public class CountingSortGeneral {


    static void countSort(int[] arr,int min,int max){


        //with the help of min and max we can create count array to store values from a[0] till a[length]
        //here min is used to reduce the count array size
        int[] count = new int[max - min +1];


        //incrementing the count of values while values act as indexes
        for(int i : arr){


            //we need to subtract the min in order to maintain the positive indexes
            count[i - min]++;
        }


        //setting up count array for output array
        for(int i = 1;i<count.length;i++){

            count[i] = count[i-1]+count[i];
        }


        //output array of size as original array
        int[] output = new int[arr.length];

        //here we need to travere reverse in order to place the elements in stable positions
        for(int i = arr.length-1;i>=0;i--){

            //as index start from 0, so we reduce the value index to -1
            output[ --count[arr[i] - min]] = arr[i];

        }

        //this is new method to copy elements from old array to new array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    //this is used to create an count array
    static int max(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(max<i){
                max = i;
            }
        }
        return max;
    }

    //this is used to create an count array
    static int min(int[] arr){

        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(min>i){
                min = i;
            }
        }
        return min;
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
        System.out.println("After Sorting: ");

        countSort(arr,min(arr),max(arr));
        System.out.println(Arrays.toString(arr));

    }
}
