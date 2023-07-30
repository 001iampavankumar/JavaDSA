package Sorting.QuickSort;
import java.util.*;

public class QuicksortWithHoare {

    static int partition(int[] arr,int low,int high){


        //we must need to take first element as pivot
        int pivot = arr[high];

        //this "i" will keep track of smaller elements
        int i = low-1;

        int j = high+1;
        //j will keep track of greater elements

        while(true){


            //find the greater index and stop
            do{
                i++;
            }while(arr[i]<pivot);

            //find the smaller index and stop
            do{
                j--;
            }while(arr[j]>pivot);


            //if smaller and greater index crosses that means we arranged the array
            if(i>=j){
                return j;
            }

            //swap the greater and smaller according to the positions
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }


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
