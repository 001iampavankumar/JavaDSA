package Recursion;

import java.util.Scanner;

public class PrintingSubArrays {


    static void subset(int[] a,int index,int[] curr){

        int n = a.length;
        if(index==n){
            for(int i = 0;i<curr.length;i++){
                System.out.print(curr[i]+" ");
            }
            System.out.println();
            return;
        }

        subset(a,index+1,curr);

        for(int i = 0;i<index+1;i++){
            curr[i] = a[index];
        }
        subset(a,index+1,curr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        int[] curr = new int[n];

        int index = 1;

        subset(a,index,curr);
    }
}
