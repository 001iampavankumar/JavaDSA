package Sorting;
import java.util.*;
public class MergeSort {

    static void merge(int[] arr,int low,int high){

        int mid = (low+high)/2;
        int[] left = new int[mid-low+1];
        int[] right = new int[high - mid];

        for(int i = 0;i<left.length;i++){

            left[i] = arr[low+i];

        }

        for(int i = 0;i<right.length;i++){

            right[i] = arr[mid+1+i];
        }


        int i = 0;
        int j = 0;
        int k = low;

        while (i<left.length&&j<right.length){

            if(left[i]<=right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        while(i<left.length){

            arr[k++] = left[i++];

        }
        while(j<right.length){

            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int[] arr,int low,int high){

        if(high>low){


            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,high);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Before : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After : ");
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}
