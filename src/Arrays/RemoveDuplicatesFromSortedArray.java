package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    //to remove duplicates
    static int removeDup(int[] arr){
        int res = 1;//this is used to keep track of distinct elements

        //1 2 2 3 3 4 5 6 6 7 8
        for(int i = 0;i<arr.length;i++){

            //check if the current element is equal or not
            //if not equal means store the current index values to res index
            if(arr[i]!=arr[res-1]){

                //assign the distinct to the begining of the same array
                arr[res] = arr[i];
                res++;
            }
        }

        return res;

    }
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            int end = removeDup(arr);
            for(int i = 0;i<end;i++){
                System.out.print(arr[i]+" ");
            }

        }
}
