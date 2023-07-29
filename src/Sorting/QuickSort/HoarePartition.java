package Sorting.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class HoarePartition {


    static int hoarePartition(int[] arr){

        //this index will keep updating the smaller values
        int i = -1;

        //this index will keep updating the larger values
        int j = arr.length;

        //we choose first element as pivot
        int pivot = arr[0];
        while(true){

            //will increment i until we find greater then pivot element
            do{
                i++;
            }while(arr[i]<pivot);

            //will increment j until we find the smaller element
            do{
                j--;
            }while(arr[j]>pivot);

            //if we cross i and j means we arranged the smaller and greater elements
            //left of j and right of j
            if(i>=j){
                return j;
            }

            //if we stopped at indexes i and j , this is the point we need swapping
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Before Partition:");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Partition:");


        System.out.println(hoarePartition(arr));
        System.out.println(Arrays.toString(arr));

    }
}
