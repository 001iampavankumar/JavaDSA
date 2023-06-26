package Arrays.SubArrays;

import java.util.Scanner;

public class PrintingSubArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for(int i = 0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        //index wise printing
        for(int i = 0;i<arr.length;i++){

            //index to range setting
            for(int j = i;j<arr.length;j++){

                //printing sub arrays
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
