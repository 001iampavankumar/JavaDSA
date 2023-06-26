package Arrays.SubArrays;

import java.util.Scanner;

public class LongestSubArrayWithSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.print("Enter Sum: ");
        int res = sc.nextInt();
        //System.out.print("enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        int count1 = 0;
        int start = -1;
        int end = -1;
        //index wise printing
        for (int i = 0; i < arr.length; i++) {

            //index to range setting
            for (int j = i; j < arr.length; j++) {

                int sum = 0;
                int count2 = 0;
                //need Sub array sum to check the input sum
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    count2++;
                }

                if(sum == res){
                    if(count1<count2){
                        start = i;
                        end = j;
                        count1 = count2;
                    }

                }
                /*for(int s = 0;s<=n-j+i;s++){
                    System.out.print("  ");
                }*/

                //System.out.print(": "+sum);
                //System.out.println();
            }
        }

        if(count1==0){
            System.out.println("No subarray found");

        }else{
            System.out.print("Longest subarray with sum K: ");
            for(int i = start;i<=end;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
}