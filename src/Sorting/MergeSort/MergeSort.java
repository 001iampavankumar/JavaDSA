package Sorting.MergeSort;
import java.util.*;
public class MergeSort {

    static void merge(int[] arr,int low,int high){

        //need mid to seperate the left and right arrays
        int mid = (low+high)/2;

        //creating the left array
        int[] left = new int[mid-low+1];

        //creating the right array
        int[] right = new int[high - mid];


        //storing the values in left array
        for(int i = 0;i<left.length;i++){

            left[i] = arr[low+i];

        }


        //storing the values in right array
        for(int i = 0;i<right.length;i++){

            right[i] = arr[mid+1+i];
        }

        //merging the two sorted arrays until one of the array ends
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

        //adding elements if there are any left in left array
        while(i<left.length){

            arr[k++] = left[i++];

        }

        //adding elements if there are any left in right array
        while(j<right.length){

            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int[] arr,int low,int high){

        if(high>low){

            //divide and conquer
            int mid = (low+high)/2;

            //recursive for left part of array
            mergeSort(arr,low,mid);

            //recursive for right part of array
            mergeSort(arr,mid+1,high);

            //finally merge the left and right array
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
