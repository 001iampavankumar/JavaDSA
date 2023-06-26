package Arrays.SubArrays;

import java.util.Scanner;

public class SubArrayOfSizeK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter SubArray size: ");
        int size = sc.nextInt();
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
                if((size-1)==(j-i)){
                    for(int k = i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                    }
                    //only go to next line when sub array size is equal to size
                    System.out.println();
                }


            }
        }
    }
}
