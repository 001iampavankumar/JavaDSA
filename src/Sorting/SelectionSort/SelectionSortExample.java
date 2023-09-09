package Sorting.SelectionSort;

import java.util.Scanner;

public class SelectionSortExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size: ");
        int n = scan.nextInt();

        System.out.println("Enter the elements: ");
        int[] arr = new int[n];

        for(int i = 0;i<arr.length;i++){

            arr[i] = scan.nextInt();
        }

        sort(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }


    }

    public static void sort(int[] arr){
       for(int i = 0;i<arr.length-1;i++){

           //this is to store max index
           int maxIndex = -1;

           //this is to store max element
           int max = Integer.MIN_VALUE;

           //this is to find max index
           for(int j = 0;j<arr.length-i;j++){

               if(max<arr[j]){
                   max = arr[j];
                   maxIndex = j;
               }
           }

           //this is to swap max index with current last index
           int temp = arr[maxIndex];
           arr[maxIndex] = arr[arr.length-i-1];
           arr[arr.length-i-1] = temp;
       }
    }

}

