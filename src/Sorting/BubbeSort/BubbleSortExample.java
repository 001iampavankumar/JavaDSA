package Sorting.BubbeSort;

import java.util.Scanner;

public class BubbleSortExample {
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

            for(int j = 0;j<arr.length-1;j++){

                //this will help to set the largest element in the current last;
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
