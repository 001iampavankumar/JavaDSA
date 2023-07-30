package Sorting.QuickSort;
import java.util.*;
import java.util.Scanner;

public class QuicksortWithLomuto {

    static int partition(int[] arr,int low,int high){


        //we must need to take last element as pivot
        //this pivot must be the center for smaller and greater elements
        int pivot = arr[high];

        //this "i" will keep track of smaller elements
        int i = low-1;
        for(int j = low;j<high;j++){


            //this is to find the smallest element and place inside the "i" boundary
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }


        //finally we have to swap the pivot element with the "i+1"th
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        //we return the pivot element index,because its sorted
        return i+1;

    }
    static void quickSort(int[] arr,int low,int high){


        //if low becomes greater than high then the array must be sorted
        if(low<high){


            //we are passing the array values in order to seperate the smallest and
            //greatest elements
            int p = partition(arr,low,high);

            //this will arrange the left half of elements
            quickSort(arr,low,p-1);

            //this will arrange the right half of elements
            quickSort(arr,p+1,high);
        }
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

        //passing array as well as low and high values of array
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }


}
