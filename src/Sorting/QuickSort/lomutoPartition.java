package Sorting.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class lomutoPartition {


    public static void lomutoPartition(int[] arr){


        //we set last index as pivot index;
        int pivot = arr.length-1;

        //need to keep smaller elements from range 0 to i
        int i = -1;

        //need to keep greater elements from j to arr.length
        int j;

        //this loop will sort the array according to the conditions
        for(j = 0;j<arr.length-1;j++){


            //swapping the elements to keep the smaller elements before i
            if(arr[j]<=arr[pivot]){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //finally swap the last element with current smaller element index further index
        // i+1 with arr.length-1;
        int temp = arr[pivot];
        arr[pivot] = arr[i+1];
        arr[i+1] = temp;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Before Partition:");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Partition:");

        lomutoPartition(arr);
        System.out.println(Arrays.toString(arr));

    }

}
