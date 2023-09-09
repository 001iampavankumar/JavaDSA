package Sorting.InsertionSort;

import java.util.Scanner;

public class InsertionSortExample {
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

            for(int j = i+1;j>0;j--){

                //there is no need to check if previous element is smaller than current
                if(arr[j]>arr[j-1]){
                    break;
                }

                //the swapping will continue until you find smaller previous element
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }

}
